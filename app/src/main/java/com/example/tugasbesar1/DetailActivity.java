package com.example.tugasbesar1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    // Mendeklarasikan bagian-bagian yang ada di activity_detail.xml
    ImageView imageViewFotoBudaya;
    TextView textViewNamaBudaya, textViewInfoBudaya;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Memberikan nilai yang telah di deklarasikan
        imageViewFotoBudaya = findViewById(R.id.imageViewFotoBudaya);
        textViewNamaBudaya = findViewById(R.id.textViewNamaBudaya);
        textViewInfoBudaya = findViewById(R.id.textViewInfoBudaya);

        // Membuat method incoming untuk intent
        getIncomingExtra();
    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("foto_budaya") && getIntent().hasExtra("nama_budaya") && getIntent().hasExtra("info_budaya")){
            // Memberikan variable untuk mengecek apakah setiap detail actiivty mempunyai nilai/tidak
            String fotoBudaya = getIntent().getStringExtra("foto_budaya");
            String namaBudaya = getIntent().getStringExtra("nama_budaya");
            String infoBudaya = getIntent().getStringExtra("info_budaya");

            // Untuk menjalankan activity baru, kami membuat sebuah method baru
            setDataActivity(fotoBudaya, namaBudaya, infoBudaya);

        }

    }
    private void setDataActivity(String fotoBudaya, String namaBudaya, String infoBudaya){
        Glide.with(this).asBitmap().load(fotoBudaya).into(imageViewFotoBudaya);
        textViewNamaBudaya.setText(namaBudaya);
        textViewInfoBudaya.setText(infoBudaya);
    }
}