package com.example.safiraaini.SAFIRAAINI_1202154315_Modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView porsi;
    TextView tempat;
    TextView nasi;
    TextView harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String aJumlah = intent.getStringExtra("jumlah");
        String aMenu = intent.getStringExtra("menu");
        String aTempat = intent.getStringExtra("tempat");
        String aHarga = intent.getStringExtra("Harga");

        int jHarga = Integer.valueOf(aHarga) * Integer.valueOf(aJumlah);

        tempat = (TextView) findViewById(R.id.textViewrm);
        tempat.setText(aTempat);
        nasi = (TextView) findViewById(R.id.textViewmkn);
        nasi.setText(aMenu);
        porsi = (TextView) findViewById(R.id.textViewangk);
        porsi.setText(aJumlah);
        harga = (TextView) findViewById(R.id.textViewrp);
        harga.setText(String.valueOf(jHarga));

        if (jHarga > 65000) {
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya !!!", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Makan Disini Aja!!!", Toast.LENGTH_LONG);
            toast.show();
        }




    }
}
