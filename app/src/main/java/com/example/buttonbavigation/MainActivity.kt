package com.example.buttonbavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.buttonbavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.idNavbar.setOnNavigationItemSelectedListener {

            when(it.itemId) {
                R.id.menuHome -> {
                    Toast.makeText(this, "Нажата кнопка Домой", Toast.LENGTH_SHORT).show()
                }

                R.id.menuFindQRCode -> {
                    Toast.makeText(this, "Нажата кнопка поиска по QR коду", Toast.LENGTH_SHORT).show()
                }

            }

            true
        }
    }
}