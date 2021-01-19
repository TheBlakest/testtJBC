package com.aplikacja.covidprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ListView;
import android.widget.Toast;

public class WebAction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String link;
        String[] webs = {
                "Ciekawy utwor","Popularny","TOP1","ZGotowy","ZPracy"
        };
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_action);
        WebView  m2WebView;
        m2WebView = (WebView)findViewById(R.id.webView2);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null ) {
            switch (bundle.getInt("side")) {
                case 0:
                    link = "https://allegro.pl/";
                    break;
                case 1:
                    link = "https://tesco.pl/zamkniecie-uslugi-e-zakupy/";
                    break;
                case 2:
                    link = "https://www.gov.pl/web/koronawirus";
                    break;
                case 3:
                    link = "https://www.pyszne.pl/";
                    break;
                default:
                    link = "https://google.com";
                    break;
            }

            m2WebView.loadUrl(link);
            //enable Java
            WebSettings webSettings = m2WebView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            //force links etc so not open chrome
            m2WebView.setWebViewClient(new WebViewClient());
        }
    }
}