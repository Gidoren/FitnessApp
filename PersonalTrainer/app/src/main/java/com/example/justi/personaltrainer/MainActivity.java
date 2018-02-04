package com.example.justi.personaltrainer;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton rightArm;
    private ImageButton leftArm;
    private ImageButton abdominal;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rightArm = (ImageButton)findViewById(R.id.rightArm);
        rightArm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                callArms();
            }
        });

        leftArm = (ImageButton)findViewById(R.id.leftArm);
        leftArm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                callArms();
            }
        });

        abdominal = (ImageButton)findViewById(R.id.abdominal);
        abdominal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                callAbs();
            }
        });

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Calculator c = new Calculator();
    }

    public void callArms()
    {
        Intent startNewActivity = new Intent(this, Arms.class);
        startActivity(startNewActivity);
    }

    public void callAbs()
    {
        Intent startNewActivity = new Intent(this, Abdominals.class);
        startActivity(startNewActivity);
    }

}
