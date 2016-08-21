package com.neil.user.mg_syllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Semester_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semester_main);
    }
    public void CseSemester(View view) {
        Intent intent = new Intent(this,Cse_Semester.class);
        startActivity(intent);
    }
    public void EceSemester(View view) {
        Intent intent = new Intent(this,Ece_Semester.class);
        startActivity(intent);
    }
    public void EeeSemester(View view) {
        Intent intent = new Intent(this,Eee_Semester.class);
        startActivity(intent);
    }
    public void AeiSemester(View view) {
        Intent intent = new Intent(this,Aei_Semester.class);
        startActivity(intent);
    }
    public void CeSemester(View view) {
        Intent intent = new Intent(this,Ce_Semester.class);
        startActivity(intent);
    }
    public void ItSemester(View view) {
        Intent intent = new Intent(this,It_Semester.class);
        startActivity(intent);
    }
    public void MeSemester(View view) {
        Intent intent = new Intent(this,Me_Semester.class);
        startActivity(intent);
    }


}

