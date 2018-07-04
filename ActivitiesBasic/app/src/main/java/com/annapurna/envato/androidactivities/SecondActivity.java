package com.annapurna.envato.androidactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tv = findViewById(R.id.textView);

        Intent i = getIntent();
        Bundle b = i.getExtras();
        assert b != null;
        String user_feedback = b.getString(Constants.KEY_FEEDBACK, "No Feedback Given!");

        tv.setText("YOUR FEEDBACK: " + user_feedback);
    }
}
