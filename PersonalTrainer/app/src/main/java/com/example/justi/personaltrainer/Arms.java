package com.example.justi.personaltrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Arms extends AppCompatActivity {

    private Button shoulder;
    private Button bicep;
    private Button tricep;
    private Button forearm;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms);

        shoulder = (Button)findViewById(R.id.shoulder);
        shoulder.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                callShoulder();
            }
        });

        bicep = (Button)findViewById(R.id.bicep);
        bicep.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                callBicep();
            }
        });

        tricep = (Button)findViewById(R.id.tricep);
        tricep.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                callTricep();
            }
        });

        forearm = (Button)findViewById(R.id.forearm);
        forearm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                callForearm();
            }
        });

    }

    public void callShoulder()
    {
        Intent startNewActivity = new Intent(this, Arms.class);
        startActivity(startNewActivity);
    }

    public void callBicep()
    {
        Intent startNewActivity = new Intent(this, Arms.class);
        startActivity(startNewActivity);
    }

    public void callTricep()
    {
        Intent startNewActivity = new Intent(this, Arms.class);
        startActivity(startNewActivity);
    }

    public void callForearm()
    {
        Intent startNewActivity = new Intent(this, Arms.class);
        startActivity(startNewActivity);
    }

}
