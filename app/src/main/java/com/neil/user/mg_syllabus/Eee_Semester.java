package com.neil.user.mg_syllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Eee_Semester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee__semester);
    }
    public void semester_IV_Eee(View view) {
        Intent intent = new Intent(this,Semester_IV_Eee.class);
        startActivity(intent);
    }
    public void semester_V_Eee(View view) {
        Intent intent = new Intent(this,Semester_V_Eee.class);
        startActivity(intent);

    }
    public void semester_VI_Eee(View view) {
        Intent intent = new Intent(this,Semester_VI_Eee.class);
        startActivity(intent);
    }
    public void semester_VII_Eee(View view) {
        Intent intent = new Intent(this,Semester_VII_Eee.class);
        startActivity(intent);
    }
    public void semester_VIII_Eee(View view) {
        Intent intent = new Intent(this,Semester_VIII_Eee.class);
        startActivity(intent);
    }
}
