package com.neil.user.mg_syllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ce_Semester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ce__semester);
    }
    public void semester_IV_Ce(View view) {
        Intent intent = new Intent(this,Semester_IV_Ce.class);
        startActivity(intent);
    }
    public void semester_V_Ce(View view) {
        Intent intent = new Intent(this,Semester_V_Ce.class);
        startActivity(intent);

    }
    public void semester_VI_Ce(View view) {
        Intent intent = new Intent(this,Semester_VI_Ce.class);
        startActivity(intent);
    }
    public void semester_VII_Ce(View view) {
        Intent intent = new Intent(this,Semester_VII_Ce.class);
        startActivity(intent);
    }
    public void semester_VIII_Ce(View view) {
        Intent intent = new Intent(this,Semester_VIII_Ce.class);
        startActivity(intent);
    }

}
