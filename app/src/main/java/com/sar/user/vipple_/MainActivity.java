package com.sar.user.vipple_;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.bottomappbar.BottomAppBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toolbar;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        SpaceNavigationView spaceNavigationView=findViewById(R.id.space);
       // spaceNavigationView.setActiveCentreButtonIconColor(getColor(Color.parseColor("#ffffff")));
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.menu));
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.message));
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.search));
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.home));

    }
     public void challange(View view)
     {
         startActivity(new Intent(MainActivity.this,Challange.class));
     }



}
