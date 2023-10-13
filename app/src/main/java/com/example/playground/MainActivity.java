package com.example.playground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void customToast(View view){

      LayoutInflater lf =  getLayoutInflater();
      View layout = lf.inflate(R.layout.custom_toast,findViewById(R.id.ct));

        textView = layout.findViewById(R.id.tv);
      textView.setText("Hwfafa");
        Toast t = new Toast(getApplicationContext());
        t.setView(layout);
        t.show();

    }
}