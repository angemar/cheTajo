package com.teamlz.cheTajo.activity;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.melnykov.fab.FloatingActionButton;
import com.teamlz.cheTajo.R;
import com.teamlz.cheTajo.adapter.SampleFragmentPagerAdapter;

/**
 * Created by francesco on 02/05/16.
 */
public class MainActivity extends AppCompatActivity {

    public static FloatingActionButton fab_add;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the ViewPager and set it's PagerAdapter so that it can display items
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        assert viewPager != null;
        viewPager.setAdapter(new SampleFragmentPagerAdapter(getSupportFragmentManager()));

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        assert tabLayout != null;
        tabLayout.setupWithViewPager(viewPager);

        fab_add = (FloatingActionButton) findViewById(R.id.fab_add);


    }
}

