// Queso Dip - Hack UCI 2018, Group members:
// Cameron Saifizadeh, Justin Kephart, Kevin Florio, Tayler Nielsen, Matthew Reingold
// Personal trainer app will be a GUI based on specifying muscle groups exercises.
// The goal is to focus on a more balanced workout instead of neglecting some muscles
// and over working others which can lead to imbalances and injury
package com.example.justi.personaltrainer;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    // Image buttons react when a user presses the selected area of the picture
    // that correlates to certain portions of the body.
    private ImageButton rightArm;
    private ImageButton leftArm;
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

        // Takes you to the right arm specifics area and displays more
        // about the muscle groups (arms map same)
        rightArm = (ImageButton)findViewById(R.id.rightArm);
        rightArm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                callArms();
            }
        });
        // Takes you to the left arm specifics area and displays more
        // about the muscle groups (arms map same)
        leftArm = (ImageButton)findViewById(R.id.leftArm);
        leftArm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                callArms();
            }
        });
        // Takes you to the abdominal specifics area and displays more
        // about the muscle groups
        abdominal = (ImageButton)findViewById(R.id.abdominal);
        abdominal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                callAbs();
            }
        });
        // Takes you to the chest/pectoral specifics area and displays more
        // about the muscle groups
        pectoral = (ImageButton)findViewById(R.id.pectoral);
        pectoral.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                callChest();
            }
        });
        // Takes you to the right leg(legs maps same) specifics area and displays more
        // about the muscle groups
        rightLeg = (ImageButton)findViewById(R.id.rightLeg);
        rightLeg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                callLegs();
            }
        });
        // Takes you to the left leg(legs map same) specifics area and displays more
        // about the muscle groups
        leftLeg = (ImageButton)findViewById(R.id.leftLeg);
        leftLeg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                callLegs();
            }
        });
        // Takes you to the back specifics area and displays more
        // about the muscle groups
        back = (ImageButton)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                callBack();
            }
        });

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Calculator c = new Calculator();
    }
    // Call the arms activity
    public void callArms()
    {
        Intent startNewActivity = new Intent(this, Arms.class);
        startActivity(startNewActivity);
    }
    // Call the abs activity
    public void callAbs()
    {
        Intent startNewActivity = new Intent(this, Abdominals.class);
        startActivity(startNewActivity);
    }
    // Call the chest activity
    public void callChest()
    {
        Intent startNewActivity = new Intent(this, Chest.class);
        startActivity(startNewActivity);
    }
    // Call the legs activity
    public void callLegs()
    {
        Intent startNewActivity = new Intent(this, Legs.class);
        startActivity(startNewActivity);
    }
    // Call the back activity
    public void callBack()
    {
        Intent startNewActivity = new Intent(this, Back.class);
        startActivity(startNewActivity);
    }

}
