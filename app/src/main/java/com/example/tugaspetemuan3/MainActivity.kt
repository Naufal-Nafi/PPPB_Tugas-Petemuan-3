package com.example.tugaspetemuan3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import android.graphics.Color
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val txtDesc: TextView = findViewById(R.id.txt_desc)
        val text = "Informasi perubahan data katalog\nPembaruan terakhir: 16-06-2022 15:00:01\nPembaruan selanjutnya: 17-06-2022 15:00:01"

        val spannableString = SpannableString(text)

        // Warna oranye untuk tanggal
        val orangeColor = Color.parseColor("#FF9462")

        // Posisikan dan warnai bagian teks yang berisi tanggal
        spannableString.setSpan(
            ForegroundColorSpan(orangeColor),
            text.indexOf("16-06-2022"),
            text.indexOf("16-06-2022") + 19,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        spannableString.setSpan(
            ForegroundColorSpan(orangeColor),
            text.indexOf("17-06-2022"),
            text.indexOf("17-06-2022") + 19,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        txtDesc.text = spannableString

    }
}