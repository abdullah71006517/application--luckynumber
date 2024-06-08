package com.example.luckynumber;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText input;
    static String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        input = findViewById(R.id.input);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = input.getText().toString(); // Get the text from EditText when the button is clicked
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("name_key", name); // Use a proper key
                startActivity(i);
            }
        });
    }
}
