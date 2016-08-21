package com.neil.user.mg_syllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class It_Semester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it__semester);
    }
    public void semester_IV_It(View view) {
        Intent intent = new Intent(this,Semester_IV_It.class);
        startActivity(intent);
    }
    public void semester_V_It(View view) {
        Intent intent = new Intent(this,Semester_V_It.class);
        startActivity(intent);

    }
    public void semester_VI_It(View view) {
        Intent intent = new Intent(this,Semester_VI_It.class);
        startActivity(intent);
    }
    public void semester_VII_It(View view) {
        Intent intent = new Intent(this,Semester_VII_It.class);
        startActivity(intent);
    }
    public void semester_VIII_It(View view) {
        Intent intent = new Intent(this,Semester_VIII_It.class);
        startActivity(intent);
    }
}
