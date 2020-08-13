package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });
    }
    public void openActivity() {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    public Toast getToast() {
        Context context = getApplicationContext();

        CharSequence message = "You just clicked the OK button";
        int duration = Toast.LENGTH_SHORT;

        Toast toast= Toast.makeText(context,message,duration);
        toast.show();
        return toast;
    }


}

