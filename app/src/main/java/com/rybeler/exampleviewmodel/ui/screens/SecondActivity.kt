package com.rybeler.exampleviewmodel.ui.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rybeler.exampleviewmodel.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }


//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if (item.itemId == android.R.id.home) {
//            // Handle the back button action here
//            onBackPressed()
//            return true
//        }
//        return super.onOptionsItemSelected(item)
//    }
}