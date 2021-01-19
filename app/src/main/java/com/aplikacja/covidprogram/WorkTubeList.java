package com.aplikacja.covidprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class WorkTubeList extends AppCompatActivity {

    String[] workouts = {
            "DOMOWY Trening Na Brzuch",                                  //1
            "RENING W DOMU (BEZ SPRZĘTU) *zbuduj sylwetkę*",             //2
            "Trening CARDIO w domu w 25 minut! ",                        //3
            "Trening FIT BODY w domu",                                   //4
            "FAT BURNING",                                               //5
            "Hot Shot Workout z Anią Lewandowską",                       //6
            "Najszybsze spalanie tkanki tłuszczowej",                    //7
            "Trening Cardio w domu w 25 minut & Anna Lewandowska",       //8
            "STRETCHING dla tych, którzy dużo siedzą przy komputerze",   //9
            "TANECZNE CARDIO | Latino Dance",                            //10
            "TRENING KLATKI W DOMU",                                     //11
            "TRENING KLATKI PIERSIOWEJ W DOMU BEZ SPRZĘTU",              //12
            "Prosty ale intensywny trening na KLATKĘ",                   //13
            "Interwałowy Trening TRX",                                   //14
            "24 ćwiczenia na TRX",                                       //15
            "TRX at Home l 40-Minute Total-Body Workout",                //16
            "TRX 35 minute HIIT Workout",                                //17
            "25 Minute TRX Suspension Training Tabata HIIT Workout",     //18
            "Ćwiczenia z TRX",                                           //19
            "TRX at Home | Total-Body Strength Workout"                  //20

    };
    String[] workoutsLinks = {
            "LIbqNET5NSs",  //1
            "X75pEADfuGo",  //2
            "PGgNdA7JBNc",  //3
            "WPPca0kjKnA",  //4
            "H5bkF_Jufuc",  //5
            "SrgvBUZF1dk",  //6
            "eA9ZLEKTeoo",  //7
            "ouj9Ksizy_g",  //8
            "UGaB6XWgMkE",  //9
            "KMfNj55Mhl8",  //10
            "eo6z6s-vUzE",  //11
            "h-fchRPJxpI",  //12
            "BMDPsnlet60",  //13
            "VyJZ5mfkv3g",  //14
            "TgD6WqyzqJ8",  //15
            "utsUU0dC2fU",  //16
            "4JAxGU3dgKo",  //17
            "GwGq9YNeirs",  //18
            "Hkz-Wtd_aoI",  //19
            "lv1PbwClmyM"   //20

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_tube_list);
        ListView listView;
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                workouts);
        listView = (ListView)findViewById(R.id.ListaW);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Intent wt = new Intent(v.getContext(), WorkTube.class);
                wt.putExtra("link",workoutsLinks[position]);
                startActivity(wt);
            }
            });

    }
}
/*




 */