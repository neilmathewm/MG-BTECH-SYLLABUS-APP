package com.neil.user.mg_syllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.view.ViewGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        if(mAdView.isLoading())
        {
            Toast.makeText(this," LOADING ADVERTISEMENT ",Toast.LENGTH_LONG).show();//just to check if ads is actually loading...
        }


    }

    public void semester_main(View view) {

        Intent intent = new Intent(this, Semester_Main.class);
        startActivity(intent);
    }
}
