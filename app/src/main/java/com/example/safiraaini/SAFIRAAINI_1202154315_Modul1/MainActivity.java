package com.example.safiraaini.SAFIRAAINI_1202154315_Modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView menu;
    TextView jumlah;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    public static final String EXTRA_MESSAGE = "com.example.firstapp.MESSAGE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void launchSecondActivity1(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        menu = (EditText) findViewById(R.id.editText2);
        String makan = menu.getText().toString();

        jumlah = (EditText) findViewById(R.id.editText3);
        String porsi = jumlah.getText().toString();




        intent.putExtra("tempat", "Eatbus");
        intent.putExtra("menu", makan);
        intent.putExtra("jumlah", porsi);
        intent.putExtra("Harga", "50000");
        startActivity(intent);



    }

    public void launchSecondActivity2(View view) {

        Intent intent = new Intent(this, SecondActivity.class);

        menu = (EditText) findViewById(R.id.editText2);
        String makan = menu.getText().toString();

        jumlah = (EditText) findViewById(R.id.editText3);
        String porsi = jumlah.getText().toString();




        intent.putExtra("tempat", "Abnormal");
        intent.putExtra("menu", makan);
        intent.putExtra("jumlah", porsi);
        intent.putExtra("Harga", "30000");

        startActivity(intent);

    }
}
