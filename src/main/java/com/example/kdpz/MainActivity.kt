package com.example.kdpz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater

import com.example.kdpz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val haski=dog(getString(R.string.haski),getString(R.string.infHaski),R.drawable.dog)
        val cat=dog(getString(R.string.cat),getString(R.string.infCat),R.drawable.cat)
        val ara=dog(getString(R.string.ara),getString(R.string.infAra),R.drawable.ara)
        binding.buttonHaski.setOnClickListener{val i= Intent(this,MainActivity2::class.java)
            i.putExtra(ANIMAL, haski)
            startActivity(i)
        }

        binding.buttonCat.setOnClickListener{val i= Intent(this,MainActivity2::class.java)
            i.putExtra(ANIMAL, cat)
            startActivity(i)
        }

        binding.buttonAra.setOnClickListener{val i= Intent(this,MainActivity2::class.java)
            i.putExtra(ANIMAL, ara)
            startActivity(i)
        }

    }

    companion object{const val ANIMAL= "key_Animal"}








}