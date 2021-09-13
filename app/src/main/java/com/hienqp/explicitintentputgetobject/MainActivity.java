package com.hienqp.explicitintentputgetobject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    Button buttonSendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSendData = (Button) findViewById(R.id.button_send_data);
        buttonSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                Student student1 = new Student("Jack P", 1990);

                intent.putExtra(SecondActivity.KEY_OF_SECOND_ACTIVITY, student1);

                startActivity(intent);
            }
        });
    }
}