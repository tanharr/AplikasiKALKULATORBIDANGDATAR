package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText txtPanjang;
    private EditText txtTinggi;
    private TextView hasilLuas;
    private TextView hasilKeliling;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPanjang = findViewById(R.id.txtPanjang);
        txtTinggi = findViewById(R.id.txtTinggi);
        hasilLuas = findViewById(R.id.txtLuas);
        hasilKeliling = findViewById(R.id.txtKeliling);

        Button btnPersegi = findViewById(R.id.btn_persegi);
        Button btnSegitiga = findViewById(R.id.btn_segitiga) ;
        Button btnLingkaran = findViewById(R.id.btn_lingkaran);

        btnPersegi.setOnClickListener((View.OnClickListener) this);
        btnSegitiga.setOnClickListener((View.OnClickListener) this);
        btnLingkaran.setOnClickListener((View.OnClickListener) this);
    }
    @SuppressLint("DefaultLocale")
    @Override
    public void onClick(View view) {
        String panjang;
        String tinggi;
        String hasilLu;
        String hasilKel;
        double douPanjang,duotinggi,hitungLu,hitungKel;
        switch (view.getId())
        {
            case R.id.btn_persegi:
                panjang = txtPanjang.getText().toString().trim();
                douPanjang =Double.parseDouble(panjang);
                hitungLu = douPanjang*douPanjang;
                hitungKel = 4*douPanjang;
                hasilKel = String.format("Keliling : %.2f",hitungKel);
                hasilLu = String.format("Luas : %.2f",hitungLu);
                hasilLuas.setText(hasilLu);
                hasilKeliling.setText(hasilKel);
                break;
            case R.id.btn_segitiga:
                panjang = txtPanjang.getText().toString().trim();
                tinggi = txtTinggi.getText().toString().trim();

                douPanjang =Double.parseDouble(panjang);
                duotinggi = Double.parseDouble(tinggi);

                hitungLu = (douPanjang*duotinggi)/2;
                hitungKel = 3*douPanjang;

                hasilLu = String.format("Luas : %.2f" , hitungLu);
                hasilKel= String.format("Keliling : %.2f",hitungKel);

                hasilLuas.setText(hasilLu);
                hasilKeliling.setText(hasilKel);
                break;
            case R.id.btn_lingkaran:
                panjang = txtPanjang.getText().toString().trim();
                douPanjang =Double.parseDouble(panjang);
                hitungLu = 3.14*0.25*(douPanjang*douPanjang);
                hitungKel = 3.14*douPanjang;
                hasilLu = String.format("Luas : %.2f" , hitungLu);
                hasilKel= String.format("Keliling : %.2f",hitungKel);

                hasilLuas.setText(hasilLu);
                hasilKeliling.setText(hasilKel);
                break;
        }
    }
}