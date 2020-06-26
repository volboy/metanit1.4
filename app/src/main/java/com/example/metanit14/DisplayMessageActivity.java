package com.example.metanit14;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Получаем сообщение из объекта Intent
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Создаем текстовое поле
        TextView textView=new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        //Устанавливаем текстовое поле в системе компановки activity
        setContentView(textView);

    }
}
