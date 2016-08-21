package com.neil.user.mg_syllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Semester_V_Me extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester__v__me);
    }
    public void Me_V_501(View view) {
        Intent intent = new Intent(this,Me_V_501.class);
        startActivity(intent);
    }
    public void Me_V_502(View view) {
        Intent intent = new Intent(this,Me_V_502.class);
        startActivity(intent);
    }
    public void Me_V_503(View view) {
        Intent intent = new Intent(this,Me_V_503.class);
        startActivity(intent);
    }
    public void Me_V_504(View view) {
        Intent intent = new Intent(this,Me_V_504.class);
        startActivity(intent);
    }
    public void Me_V_505(View view) {
        Intent intent = new Intent(this,Me_V_505.class);
        startActivity(intent);
    }
    public void Me_V_506(View view) {
        Intent intent = new Intent(this,Me_V_506.class);
        startActivity(intent);
    }
    public void Me_V_507(View view) {
        Intent intent = new Intent(this,Me_V_507.class);
        startActivity(intent);
    }
    public void Me_V_508(View view) {
        Intent intent = new Intent(this,Me_V_508.class);
        startActivity(intent);
    }
}
