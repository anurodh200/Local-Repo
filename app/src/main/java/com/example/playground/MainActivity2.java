package com.example.playground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText nm,ps,pn;
    RadioButton rb_male, rb_female;
    CheckBox cb1,cb2,cb3,cb4;
    Spinner sp_cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nm = findViewById(R.id.nm);
        ps = findViewById(R.id.ps);
        pn = findViewById(R.id.pn);

        rb_female = findViewById(R.id.rb_female);
        rb_male = findViewById(R.id.rb_male);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);

        sp_cities = findViewById(R.id.sp_cities);
    }

    public void getAllValues(View view){
        String name = nm.getText().toString();
        String password = ps.getText().toString();
        String phone = pn.getText().toString();

        String gender = "";

        if(rb_male.isChecked()){
            gender = rb_male.getText().toString();
        }
        if(rb_male.isChecked()){
            gender = rb_female.getText().toString();
        }


        String interest = "";

        if(cb1.isChecked()){
            interest += cb1.getText().toString()+"\n";
        }if(cb2.isChecked()){
            interest += cb2.getText().toString()+"\n";
        }if(cb3.isChecked()){
            interest += cb3.getText().toString()+"\n";
        }if(cb4.isChecked()){
            interest += cb4.getText().toString()+"\n";
        }

        String city = sp_cities.getSelectedItem().toString();

        String res = name+"\n"+password+"\n"+phone+"\n"+gender+"\n"+interest+"\n"+city;
        Toast.makeText(this,res,Toast.LENGTH_SHORT).show();

    }
}