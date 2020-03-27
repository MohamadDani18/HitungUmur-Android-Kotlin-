package com.example.hitungumur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFindUmur.setOnClickListener{

            //deklarasi edit text
            var tahunLahir = etHitungUmur.text.toString().toInt();

            //get tahun saat ini dengan calender
            var tahun:Int = Calendar.getInstance().get(Calendar.YEAR)

            // set umur = tahun saat ini dikurang dengan input pada kolom text
            var umur = tahun - tahunLahir

            //hasil
            tvUmur.text = "Umur = $umur tahun"

        }
    }
}
