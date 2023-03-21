package com.example.kdpz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.kdpz.databinding.ActivityMainBinding
import com.example.kdpz.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var dog= intent.getParcelableExtra<dog>(MainActivity.ANIMAL)

        binding.textDescription.text=dog!!.discription

        binding.im.setImageResource(dog.image)


        title=dog?.name

    }
}