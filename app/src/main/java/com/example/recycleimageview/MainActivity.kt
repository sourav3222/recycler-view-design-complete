package com.example.recycleimageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recycleimageview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var fooditam = listOf <man>(
        man(R.drawable.picc,"01929402809"),
        man(R.drawable.picb,"01929402509"),
        man(R.drawable.picd,"01929402309"),
        man(R.drawable.pice,"01929402809"),
        man(R.drawable.picf,"01929407809"),
        man(R.drawable.picg,"01929422809"),
        man(R.drawable.pich,"01929502809"),
        man(R.drawable.pici,"01929302809")
    )




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ad = Adapter(
            man(fooditam[0].image,
                fooditam[0].number

            ))
        ad.submitList(fooditam)
        binding.recycler.adapter = ad
    }


}