package com.slpeez.spleez.Activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.slpeez.spleez.Menu.NavigationDrawer;


public class Creer_Activity_ extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creer_activity);

        /* Initialisation menu */
        final DrawerLayout drawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);
        final ImageButton spleez = (ImageButton) findViewById(R.id.spleez);
        final ImageView photo = (ImageView) findViewById(R.id.icon_image);
        final Bitmap obm = BitmapFactory.decodeResource(getResources(), R.drawable.profile_image);
        NavigationDrawer nd = new NavigationDrawer(this, drawer_layout, spleez, obm, photo).navigationDrawerInitialize();



        ImageButton Event = (ImageButton)findViewById(R.id.logoevent);
        ImageButton Sport= (ImageButton)findViewById(R.id.Sport);
        ImageButton Cafe= (ImageButton)findViewById(R.id.Cafe);
        ImageButton Voyage= (ImageButton)findViewById(R.id.Voyage);
        ImageButton Cinema= (ImageButton)findViewById(R.id.Cinema);
        ImageButton Apero= (ImageButton)findViewById(R.id.Apero);
        ImageButton JeuxVideo= (ImageButton)findViewById(R.id.JeuxVideo);
        ImageButton Atable= (ImageButton)findViewById(R.id.Atable);
        ImageButton Jobs= (ImageButton)findViewById(R.id.Jobs);
        ImageButton Culture= (ImageButton)findViewById(R.id.Culture);
        final Intent  i= new Intent(getApplicationContext(), Creation_Activity.class);
        
        Sport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i.putExtra("type",1);
                startActivity(i);
            }
        });
        Voyage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i.putExtra("type",2);
                startActivity(i);
            }
        });
        Cafe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i.putExtra("type",3);
                startActivity(i);
            }
        });
        Cinema.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i.putExtra("type",4);
                startActivity(i);
            }
        });
        Culture.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i.putExtra("type",5);
                startActivity(i);
            }
        });
        JeuxVideo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i.putExtra("type",6);
                startActivity(i);
            }
        });
        Jobs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i.putExtra("type",7);
                startActivity(i);
            }
        });
        Apero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i.putExtra("type",8);
                startActivity(i);
            }
        });
        Atable.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i.putExtra("type",9);
                startActivity(i);
            }
        });


        Event.setOnClickListener(new View.OnClickListener() {
            //b.setOnClickListener(View.OnClickListener t)  = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAmis = new Intent(getApplicationContext(), ChoiceActivity.class);
                startActivity(openAmis);
            }
        });
        /*Activite.setOnClickListener(new View.OnClickListener() {
            //b.setOnClickListener(View.OnClickListener t)  = new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent  openActivite= new Intent(getApplicationContext(), Creer_Activity_.class);
                startActivity(openActivite);
            }
        });*/

    }

}