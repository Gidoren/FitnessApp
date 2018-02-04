package com.example.justi.personaltrainer;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by justi on 2/4/2018.
 */

public class Pop extends Activity {

    static String text = "S'all Good";
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popwindow);

        message = (TextView)findViewById(R.id.message);
        message.setText(text);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width * .7), (int)(height * .2));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Pop.setMessage("S'all Good");
    }

    public static void setMessage(String m)
    {
        text = m;
    }

    public static String getMessage()
    {
        return text;
    }

}
