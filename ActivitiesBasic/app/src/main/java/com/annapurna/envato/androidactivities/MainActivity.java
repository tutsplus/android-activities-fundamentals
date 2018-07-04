package com.annapurna.envato.androidactivities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import static com.annapurna.envato.androidactivities.Constants.KEY_FEEDBACK;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private EditText etFeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = findViewById(R.id.relative_layout);
        Button buttonYellow = findViewById(R.id.button_yellow);
        Button buttonWhite = findViewById(R.id.button_white);
        etFeedback = findViewById(R.id.editText_feedback);

        buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundColor(Color.YELLOW);
            }
        });

    }

    public void setBackgroundWhite(View view) {
        relativeLayout.setBackgroundColor(Color.WHITE);
    }

    public void moveToSecondActivity(View view) {
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(i);
    }

    public void submitFeedback(View view) {
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        i.putExtra(KEY_FEEDBACK, etFeedback.getText().toString());
        startActivity(i);
    }
}
