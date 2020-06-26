package com.example.metanit14;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent; //подключаем класс Intent
import android.os.Bundle;
import android.view.View; //подключаем класс View для обработки нажатия кнопки
import android.widget.EditText; // подключаем класс EditText

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE="EXTRA_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Метод обработки нажатия на кнопку
    public void sendMessage(View view){
        //действия, совершаемые после нажатия на кнопку
        //Создаем объект Intent для вызова новой Activity
        Intent intent=new Intent(this, DisplayMessageActivity.class);
        //Получаем текстовое поле в текущей Activity
        EditText editText=findViewById(R.id.edit_message);
        //Получаем текст данного текстового поля
        String message=editText.getText().toString();
        //Добавляем с помощью свойства putExtra объект - первый параметр - ключ,
        //второй - значение этого объекта
        intent.putExtra(EXTRA_MESSAGE, message);
        //запуск activity
        startActivity(intent);
    }
}
