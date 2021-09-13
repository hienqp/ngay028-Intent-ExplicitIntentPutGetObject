package com.hienqp.explicitintentputgetobject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String KEY_OF_SECOND_ACTIVITY = "SecondActivity";

    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewResult = (TextView) findViewById(R.id.textView_get_data);

        Intent intent = getIntent();

        Student student = (Student) intent.getSerializableExtra(SecondActivity.KEY_OF_SECOND_ACTIVITY);

        textViewResult.setText(student.getFullName() + " - " + student.getYearBirth());
    }
}