package com.app.playtolife.remington;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton imageButton;
    ImageButton imageButton2;
    ImageButton imageButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = (ImageButton)findViewById(R.id.imageButton);
        imageButton.setOnClickListener(this);
        imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(this);
        imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageButton:
                Intent intent = new Intent(this, Email.class);
                startActivity(intent);
                break;
            case  R.id.imageButton2:
                Intent intent2 = new Intent(this, Q10.class);
                startActivity(intent2);
                break;
            case R.id.imageButton3:
                Intent intent3 = new Intent(this, moodle.class);
                startActivity(intent3);
                break;
        }
    }
}
