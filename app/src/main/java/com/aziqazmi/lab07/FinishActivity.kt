package com.aziqazmi.lab07

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aziqazmi.lab07.databinding.ActivityConfirmBinding
import com.aziqazmi.lab07.databinding.ActivityFinishBinding

class FinishActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFinishBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =  ActivityFinishBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
}