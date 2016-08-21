package com.neil.user.mg_syllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ece_Semester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece__semester);
    }
    public void semester_IV_Ece(View view) {
        Intent intent = new Intent(this,Semester_IV_Ece.class);
        startActivity(intent);
    }
    public void semester_V_Ece(View view) {
        Intent intent = new Intent(this,Semester_V_Ece.class);
        startActivity(intent);

    }
    public void semester_VI_Ece(View view) {
        Intent intent = new Intent(this,Semester_VI_Ece.class);
        startActivity(intent);
    }
    public void semester_VII_Ece(View view) {
        Intent intent = new Intent(this,Semester_VII_Ece.class);
        startActivity(intent);
    }
    public void semester_VIII_Ece(View view) {
        Intent intent = new Intent(this,Semester_VIII_Ece.class);
        startActivity(intent);
    }

}

