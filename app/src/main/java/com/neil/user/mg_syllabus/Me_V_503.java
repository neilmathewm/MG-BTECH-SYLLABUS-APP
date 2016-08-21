package com.neil.user.mg_syllabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class Me_V_503 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me__v_503);
        try {
            InputStream is = getAssets().open("me_v_503.txt");

            // We guarantee that the available method returns the total
            // size of the asset...  of course, this does mean that a single
            // asset can't be more than 2 gigs.
            int size = is.available();

            // Read the entire asset into a local byte buffer.
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            // Convert the buffer into a string.
            String text = new String(buffer);

            // Finally stick the string into the text view.
            TextView tv = (TextView)findViewById(R.id.textView1);
            tv.setText(text);
        } catch (IOException e) {
            // Should never happen!
            throw new RuntimeException(e);
        } }
}
