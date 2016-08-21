package com.neil.user.mg_syllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Aei_Semester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aei__semester);
    }
    public void semester_IV_Aei(View view) {
        Intent intent = new Intent(this,Semester_IV_Aei.class);
        startActivity(intent);
    }
    public void semester_V_Aei(View view) {
        Intent intent = new Intent(this,Semester_V_Aei.class);
        startActivity(intent);

    }
    public void semester_VI_Aei(View view) {
        Intent intent = new Intent(this,Semester_VI_Aei.class);
        startActivity(intent);
    }
    public void semester_VII_Aei(View view) {
        Intent intent = new Intent(this,Semester_VII_Aei.class);
        startActivity(intent);
    }
    public void semester_VIII_Aei(View view) {
        Intent intent = new Intent(this,Semester_VIII_Aei.class);
        startActivity(intent);
    }
}
