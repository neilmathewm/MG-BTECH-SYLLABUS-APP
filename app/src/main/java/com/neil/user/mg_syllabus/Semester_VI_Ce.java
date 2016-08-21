package com.neil.user.mg_syllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Semester_VI_Ce extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester__vi__ce);
    }
    public void Ce_VI_601(View view) {
        Intent intent = new Intent(this,Ce_VI_601.class);
        startActivity(intent);
    }
    public void Ce_VI_602(View view) {
        Intent intent = new Intent(this,Ce_VI_602.class);
        startActivity(intent);
    }
    public void Ce_VI_603(View view) {
        Intent intent = new Intent(this,Ce_VI_603.class);
        startActivity(intent);
    }
    public void Ce_VI_604(View view) {
        Intent intent = new Intent(this,Ce_VI_604.class);
        startActivity(intent);
    }
    public void Ce_VI_605(View view) {
        Intent intent = new Intent(this,Ce_VI_605.class);
        startActivity(intent);
    }
    public void Ce_VI_6061(View view) {
        Intent intent = new Intent(this,Ce_VI_6061.class);
        startActivity(intent);
    }

    public void Ce_VI_6062(View view) {
        Intent intent = new Intent(this,Ce_VI_6062.class);
        startActivity(intent);
    }

    public void Ce_VI_607(View view) {
        Intent intent = new Intent(this,Ce_VI_607.class);
        startActivity(intent);
    }
    public void Ce_VI_608(View view) {
        Intent intent = new Intent(this,Ce_VI_608.class);
        startActivity(intent);
    }
}
