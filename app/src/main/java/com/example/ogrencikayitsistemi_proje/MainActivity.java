package com.example.ogrencikayitsistemi_proje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText editTxtAd, editTxtSoyad, editTxtNum, editTxtsinif;
    private RadioButton radioBtnK, radioBtnA;

    private String editAd, editSoyad, editNum, editSinif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //edittextler
        editTxtAd=(EditText) findViewById(R.id.editTxtAd);
        editTxtSoyad=(EditText) findViewById(R.id.editTxtSoyad);
        editTxtNum=(EditText) findViewById(R.id.editTxtNum);
        editTxtsinif=(EditText) findViewById(R.id.editTxtsinif);

        //radiobuttonlar
        radioBtnA=(RadioButton) findViewById(R.id.radioBtnA);
        radioBtnK=(RadioButton) findViewById(R.id.radioBtnK);

    }

    public void btnKayitOl(View v){
        editAd=editTxtAd.getText().toString();
        editSoyad=editTxtSoyad.getText().toString();
        editNum=editTxtNum.getText().toString();
        editSinif=editTxtsinif.getText().toString();

        if (!TextUtils.isEmpty(editAd) && !TextUtils.isEmpty(editSoyad) && !TextUtils.isEmpty(editNum) && !TextUtils.isEmpty(editSinif)){
            System.out.println("----------Bilgileriniz----------");
            System.out.println("Adınız:"+editAd);
            System.out.println("Soyadınız:"+editSoyad);
            System.out.println("Numaranız:"+editNum);
            System.out.println("Sınıfınız"+editSinif);

            if (radioBtnK.isChecked())
            System.out.println("Cinsiyetiniz :"+radioBtnK.getText().toString());
            else
                System.out.println("Cinsiyetiniz:"+radioBtnA.getText().toString());
        }

    }
}