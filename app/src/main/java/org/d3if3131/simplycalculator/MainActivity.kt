package org.d3if3131.simplycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var EditBilangan1: EditText
    private lateinit var EditBilangan2: EditText
    private lateinit var ViewHasil: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EditBilangan1 = findViewById(R.id.edit_bilangan_pertama)
        EditBilangan2 = findViewById(R.id.edit_bilangan_kedua)
        ViewHasil = findViewById(R.id.hasil_perhitungan)
        val ButtonTambah: Button = findViewById(R.id.buttonTambah)
        val ButtonKurang: Button = findViewById(R.id.buttonKurang)
        val ButtonKali: Button = findViewById(R.id.buttonKali)
        val ButtonBagi: Button = findViewById(R.id.buttonBagi)

        ButtonTambah.setOnClickListener(this)
        ButtonKurang.setOnClickListener(this)
        ButtonKali.setOnClickListener(this)
        ButtonBagi.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.buttonTambah -> {
                    val HasilTambah = EditBilangan1.text.toString().trim()
                        .toDouble() + EditBilangan2.text.toString().toDouble()
                    ViewHasil.text = HasilTambah.toString()
                }
                R.id.buttonKurang -> {
                    val HasilKurang = EditBilangan1.text.toString().trim()
                        .toDouble() - EditBilangan2.text.toString().toDouble()
                    ViewHasil.text = HasilKurang.toString()
                }
                R.id.buttonKali -> {
                    val HasilKali = EditBilangan1.text.toString().trim()
                        .toDouble() + EditBilangan2.text.toString().toDouble()
                    ViewHasil.text = HasilKali.toString()
                }
                R.id.buttonBagi -> {
                    val HasilBagi = EditBilangan1.text.toString().trim()
                        .toDouble() + EditBilangan2.text.toString().toDouble()
                    ViewHasil.text = HasilBagi.toString()
                }
            }
        }
    }
}