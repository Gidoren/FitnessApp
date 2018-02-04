package com.example.justi.personaltrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Shoulders extends AppCompatActivity
{
    private Button front;
    private Button side;
    private Button rear;
    private static int front_count = 0;
    private static int side_count = 0;
    private static int rear_count = 0;
    TextView front_num;
    TextView side_num;
    TextView rear_num;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulders);


        front = (Button) findViewById(R.id.front);
        front_num = (TextView)findViewById(R.id.front_num);
        front.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ++front_count;
                Calculator.workCalculations("front deltoid raise");
                front_num.setText(Integer.toString(Calculator.getArmShoulderAnterior()));
                side_num.setText(Integer.toString(Calculator.getArmShoulderMiddle()));
                rear_num.setText(Integer.toString(Calculator.getArmShoulderPosterior()));
                if(Pop.getMessage() != "S'all Good")
                {
                    popUp();
                }
            }
        });

        side = (Button)findViewById(R.id.side);
        side_num = (TextView)findViewById(R.id.side_num);
        side.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ++side_count;
                Calculator.workCalculations("side deltoid raise");
                front_num.setText(Integer.toString(Calculator.getArmShoulderAnterior()));
                side_num.setText(Integer.toString(Calculator.getArmShoulderMiddle()));
                rear_num.setText(Integer.toString(Calculator.getArmShoulderPosterior()));
                if(Pop.getMessage() != "S'all Good")
                {
                    popUp();
                }
            }
        });

        rear = (Button)findViewById(R.id.rear);
        rear_num = (TextView)findViewById(R.id.rear_num);
        rear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               ++rear_count;
                Calculator.workCalculations("rear deltoid flies");
                front_num.setText(Integer.toString(Calculator.getArmShoulderAnterior()));
                side_num.setText(Integer.toString(Calculator.getArmShoulderMiddle()));
                rear_num.setText(Integer.toString(Calculator.getArmShoulderPosterior()));
                if(Pop.getMessage() != "S'all Good")
                {
                    popUp();
                }
            }
        });
        front_num.setText(Integer.toString(Calculator.getArmShoulderAnterior()));
        side_num.setText(Integer.toString(Calculator.getArmShoulderMiddle()));
        rear_num.setText(Integer.toString(Calculator.getArmShoulderPosterior()));

    }

    public void popUp()
    {
    startActivity(new Intent(Shoulders.this,Pop.class));
    }
}

