package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import java.util.Random;


public class MainActivity2 extends AppCompatActivity {

    TextView textView3,textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView3 = findViewById(R.id.textView3);

        String r = getIntent().getStringExtra("name_key");  // Use the same key
        if (r != null) {
            textView3.setText("hey " + r);
        } else {
            textView3.setText("No data received");
        }
        int i=generateRandomNumber();
        textView1=findViewById(R.id.textView1);
        textView1.setText(""+i);

    }

    public int generateRandomNumber() {
        Random random = new Random();
        int upper_limit = 100;

        int randomNumberGenerated = random.nextInt(upper_limit);
        return randomNumberGenerated;
    }
}




