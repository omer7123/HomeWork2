package com.ripalay.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ripalay.homework2.databinding.ActivityMainBinding
import com.ripalay.homework2.extensions.load
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val images = mutableListOf<String>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addImages()
        binding.sendBtn.setOnClickListener {
            images.add(binding.imageEdit.text.toString())
        }

        binding.randomBtn.setOnClickListener {
            binding.homeIv.load(images[Random.nextInt(images.size)])
        }
    }

    private fun addImages() {
        images.add("https://vjoy.cc/wp-content/uploads/2020/09/bezymyannyjkvytstsk.jpg")
        images.add("https://avatarko.ru/img/kartinka/1/avatarko_anonim.jpg")
        images.add("https://vjoy.cc/wp-content/uploads/2020/09/bezymyannyjkvyts.jpg")
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSyvYA_yJRv4V_zKFWLlG8lG-yMxF1asBRg_w&usqp=CAU.jpg")
        images.add("https://klike.net/uploads/posts/2020-04/1587719791_1.jpg")
    }
}



//https://www.google.com/url?sa=i&url=https%3A%2F%2Fvjoy.cc%2Fsuper-kartinki-na-telefon-37-foto%2F&psig=AOvVaw2ce9wemv1Dj5gorNyRplNe&ust=1639927781391000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCKjPoqnV7fQCFQAAAAAdAAAAABAD
//
//
//
//