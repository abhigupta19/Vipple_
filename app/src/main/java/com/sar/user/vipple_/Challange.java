package com.sar.user.vipple_;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;

public class Challange extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challange);
        SpaceNavigationView spaceNavigationView=findViewById(R.id.space);
        // spaceNavigationView.setActiveCentreButtonIconColor(getColor(Color.parseColor("#ffffff")));
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.menu));
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.message));
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.search));
        spaceNavigationView.addSpaceItem(new SpaceItem("",R.drawable.home));
    }
}
