package com.rybeler.exampleviewmodel.ui.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rybeler.exampleviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // inflate, inflacion como se inflan las vistas en los activities?

        /*val button1 = findViewById<Button>(R.id.button1)

        button1.setOnClickListener {
            val intent = Intent(this, )
        }*/

    }
}
