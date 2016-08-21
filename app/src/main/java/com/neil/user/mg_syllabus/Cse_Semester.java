package com.neil.user.mg_syllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cse_Semester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse__semester);
    }
    public void semester_IV(View view) {
        Intent intent = new Intent(this,Semester_IV_Cse.class);
        startActivity(intent);
    }
    public void semester_V(View view) {
        Intent intent = new Intent(this,Semester_V_Cse.class);
        startActivity(intent);

    }
    public void semester_VI(View view) {
        Intent intent = new Intent(this,Semester_VI_Cse.class);
        startActivity(intent);
    }
    public void semester_VII(View view) {
        Intent intent = new Intent(this,Semester_VII_Cse.class);
        startActivity(intent);
    }
    public void semester_VIII(View view) {
        Intent intent = new Intent(this,Semester_VIII_Cse.class);
        startActivity(intent);
    }
}
