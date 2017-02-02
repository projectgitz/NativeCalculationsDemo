package com.chetan.calculationsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("calc-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText("Sum:" + sumTwoValues(10, 20) + "\nMultiplication:"
                + multiplicationTwoValues(10, 20));
    }

    public native int sumTwoValues(int a, int b);

    public native int multiplicationTwoValues(int a, int b);

}
