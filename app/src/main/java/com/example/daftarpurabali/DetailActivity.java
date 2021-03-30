package com.example.daftarpurabali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {


    ImageView imageViewFoto;
    TextView textViewNamaPura, textViewInfoPura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFoto = findViewById(R.id.imageViewFoto);
        textViewNamaPura = findViewById(R.id.textViewNamaPura);
        textViewInfoPura = findViewById(R.id.textViewInfoPura);

        getIncomingExtra();
    }

    private void getIncomingExtra(){

        if(getIntent().hasExtra("foto_pura") && getIntent().hasExtra("nama_pura") && getIntent().hasExtra("info_pura")){


            String Foto = getIntent().getStringExtra("foto_pura");
            String namaPura = getIntent().getStringExtra("nama_pura");
            String infoPura = getIntent().getStringExtra("info_pura");

            setDataActivity(Foto, namaPura, infoPura);
        }
    }

    private void setDataActivity(String Foto, String namaPura, String infoPura){


        Glide.with(this).asBitmap().load(Foto).into(imageViewFoto);
        textViewNamaPura.setText(namaPura);
        textViewInfoPura.setText(infoPura);


    }
}