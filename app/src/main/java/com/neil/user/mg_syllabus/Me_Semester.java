package com.neil.user.mg_syllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Me_Semester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me__semester);
    }
    public void semester_IV_Me(View view) {
        Intent intent = new Intent(this,Semester_IV_Me.class);
        startActivity(intent);
    }
    public void semester_V_Me(View view) {
        Intent intent = new Intent(this,Semester_V_Me.class);
        startActivity(intent);

    }
    public void semester_VI_Me(View view) {
        Intent intent = new Intent(this,Semester_VI_Me.class);
        startActivity(intent);
    }
    public void semester_VII_Me(View view) {
        Intent intent = new Intent(this,Semester_VII_Me.class);
        startActivity(intent);
    }
    public void semester_VIII_Me(View view) {
        Intent intent = new Intent(this,Semester_VIII_Me.class);
        startActivity(intent);
    }
}
