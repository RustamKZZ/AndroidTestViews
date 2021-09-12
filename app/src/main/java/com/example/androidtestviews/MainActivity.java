package com.example.androidtestviews;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText textED;
    Button btnSave;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textED = findViewById(R.id.text_ed);
        btnSave = findViewById(R.id.btn_save);
        btnCancel = findViewById(R.id.btn_cancel);


        View.OnClickListener playButton;
        playButton = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btn_save:
                        textED.setText("Сохранено");
                        break;
                    case R.id.btn_cancel:
                        textED.setText("Отмена");
                }
            }
        };
        textED.setOnClickListener(playButton);
        btnSave.setOnClickListener(playButton);
        btnCancel.setOnClickListener(playButton);

    }


}