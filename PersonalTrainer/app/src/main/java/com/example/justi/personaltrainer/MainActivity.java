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

    Calculator c;

    private ImageButton abdominal;
    private ImageButton pectoral;
    private ImageButton leftLeg;
    private ImageButton rightLeg;
    private ImageButton back;
    
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

        pectoral = (ImageButton)findViewById(R.id.pectoral);
        pectoral.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                callChest();
            }
        });

        rightLeg = (ImageButton)findViewById(R.id.rightLeg);
        rightLeg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                callLegs();
            }
        });

        leftLeg = (ImageButton)findViewById(R.id.leftLeg);
        leftLeg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                callLegs();
            }
        });

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        c = new Calculator();
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

    public void callChest()
    {
        Intent startNewActivity = new Intent(this, Chest.class);
        startActivity(startNewActivity);
    }

    public void callLegs()
    {
        Intent startNewActivity = new Intent(this, Legs.class);
        startActivity(startNewActivity);
    }

}
