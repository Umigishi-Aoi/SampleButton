package com.zerokaraapp.samplebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタンのid button から ボタンのオブジェクトButtonを取得
        Button button = findViewById(R.id.button);                      //[7]

        //下で定義したButtonListenerのインスタンスを生成
        ButtonListener buttonlistener = new ButtonListener();           //[8]

        //ボタンに押されたときの挙動ができるようbuttonListenerを設定
        button.setOnClickListener(buttonlistener);                      //[9]
    }

    private class ButtonListener implements View.OnClickListener{       //[1]
        @Override
        public void onClick(View view){                                 //[2]

            //文字入力欄のid editText から 文字入力欄のオブジェクトEditTextを取得
            EditText editText = findViewById(R.id.editText);            //[3]

            //文字出力のid textView から 文字出力欄のオブジェクトtextViewを取得
            TextView textView = findViewById(R.id.textView);            //[4]

            //入力された文字列をeditTextから取得し、string に保存
            String string = editText.getText().toString();              //[5]

            //string の文字列(入力された文字列)をtextView に入力。画面に表示される
            textView.setText(string);                                   //[6]

        }
    }
}