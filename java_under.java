package com.example.lab3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText edit_name;
    private TextView textname,textname1,textwinner,textmy,textrobot;
    private RadioButton radioButton1,radioButton2,radioButton3;
    private Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //connect xml file
        edit_name = findViewById(R.id.edit_name);
        textname = findViewById(R.id.textView);
        textname1 = findViewById(R.id.textView2);
        textwinner = findViewById(R.id.textView3);
        textmy = findViewById(R.id.textView4);
        textrobot = findViewById(R.id.textView5);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
                if (edit_name.length() < 1) {
                    textname.setText("請輸入玩家姓名");
                }
                else {
                    textname1.setText(String.format("name\n%s", edit_name.getText().toString()));

                    if (radioButton1.isChecked()) {
                        textmy.setText("我方出拳\n剪刀");
                    } else if (radioButton2.isChecked()) {
                        textmy.setText("我方出拳\n石頭");
                    } else {
                        textmy.setText("我方出拳\n布");
                    }

                    int computer_random = (int) (Math.random() * 3);

                    if (computer_random == 0) {
                        textrobot.setText("電腦出拳\n剪刀");
                    } else if (computer_random == 1) {
                        textrobot.setText("電腦出拳\n石頭");
                    } else {
                        textrobot.setText("電腦出拳\n布");
                    }

                    if ((radioButton1.isChecked() && computer_random == 2) ||
                            (radioButton2.isChecked() && computer_random == 0) ||
                            (radioButton3.isChecked() && computer_random == 1)) {
                        textwinner.setText("勝利者\n" + edit_name.getText().toString());
                        textname.setText("恭喜你獲勝了");
                    } else if ((radioButton1.isChecked() && computer_random == 1) ||
                            (radioButton2.isChecked() && computer_random == 2) ||
                            (radioButton3.isChecked() && computer_random == 0)) {
                        textwinner.setText("勝利者\n電腦");
                        textname.setText("可惜，電腦獲勝");
                    } else {
                        textwinner.setText("勝利者\n平手");
                        textname.setText("平局");
                    }
                }
        });
    }
}


