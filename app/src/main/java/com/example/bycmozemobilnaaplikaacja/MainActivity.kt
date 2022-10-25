package com.example.bycmozemobilnaaplikaacja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<CheckBox>(R.id.checkBox).setOnClickListener {
            if (findViewById<CheckBox>(R.id.checkBox).isChecked == true) {
                findViewById<ImageView>(R.id.imageView).visibility = View.VISIBLE
            }
            else
            {
                findViewById<ImageView>(R.id.imageView).visibility = View.INVISIBLE
            }
        }
        findViewById<CheckBox>(R.id.checkBox2).setOnClickListener {
            if (findViewById<CheckBox>(R.id.checkBox2).isChecked == true) {
                findViewById<ImageView>(R.id.imageView4).visibility = View.VISIBLE
            }
            else
            {
                findViewById<ImageView>(R.id.imageView4).visibility = View.INVISIBLE
            }
        }
        findViewById<CheckBox>(R.id.checkBox3).setOnClickListener {
            if (findViewById<CheckBox>(R.id.checkBox3).isChecked == true) {
                findViewById<ImageView>(R.id.imageView5).visibility = View.VISIBLE
            }
            else
            {
                findViewById<ImageView>(R.id.imageView5).visibility = View.INVISIBLE
            }
        }
        findViewById<CheckBox>(R.id.checkBox4).setOnClickListener {
            if (findViewById<CheckBox>(R.id.checkBox4).isChecked == true) {
                findViewById<ImageView>(R.id.imageView6).visibility = View.VISIBLE
            }
            else
            {
                findViewById<ImageView>(R.id.imageView6).visibility = View.INVISIBLE
            }
        }
        findViewById<CheckBox>(R.id.checkBox5).setOnClickListener {
            if (findViewById<CheckBox>(R.id.checkBox5).isChecked == true) {
                findViewById<ImageView>(R.id.imageView7).visibility = View.VISIBLE
            }
            else
            {
                findViewById<ImageView>(R.id.imageView7).visibility = View.INVISIBLE
            }
        }
        findViewById<CheckBox>(R.id.checkBox6).setOnClickListener {
            if (findViewById<CheckBox>(R.id.checkBox6).isChecked == true) {
                findViewById<ImageView>(R.id.imageView8).visibility = View.VISIBLE
            }
            else
            {
                findViewById<ImageView>(R.id.imageView8).visibility = View.INVISIBLE
            }
        }
        findViewById<CheckBox>(R.id.checkBox7).setOnClickListener {
            if (findViewById<CheckBox>(R.id.checkBox7).isChecked == true) {
                findViewById<ImageView>(R.id.imageView9).visibility = View.VISIBLE
            }
            else
            {
                findViewById<ImageView>(R.id.imageView9).visibility = View.INVISIBLE
            }
        }
        findViewById<CheckBox>(R.id.checkBox8).setOnClickListener {
            if (findViewById<CheckBox>(R.id.checkBox8).isChecked == true) {
                findViewById<ImageView>(R.id.imageView10).visibility = View.VISIBLE
            }
            else
            {
                findViewById<ImageView>(R.id.imageView10).visibility = View.INVISIBLE
            }
        }
        findViewById<CheckBox>(R.id.checkBox9).setOnClickListener {
            if (findViewById<CheckBox>(R.id.checkBox9).isChecked == true) {
                findViewById<ImageView>(R.id.imageView11).visibility = View.VISIBLE
            }
            else
            {
                findViewById<ImageView>(R.id.imageView11).visibility = View.INVISIBLE
            }
        }
        findViewById<CheckBox>(R.id.checkBox10).setOnClickListener {
            if (findViewById<CheckBox>(R.id.checkBox10).isChecked == true) {
                findViewById<ImageView>(R.id.imageView12).visibility = View.VISIBLE
            } else {
                findViewById<ImageView>(R.id.imageView12).visibility = View.INVISIBLE
            }
        }
    }
}