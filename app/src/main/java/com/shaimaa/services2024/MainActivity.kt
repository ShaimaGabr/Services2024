package com.shaimaa.services2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shaimaa.services2024.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {

            startService.setOnClickListener {
                startService(Intent(this@MainActivity,MyService::class.java))
            }
            stopService.setOnClickListener {
                stopService(Intent(this@MainActivity,MyService::class.java))
            }
        }
    }
}