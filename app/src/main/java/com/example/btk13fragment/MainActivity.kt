package com.example.btk13fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun ilkfragment(view: View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction() //İşlem yapmaya başlıyoruz

        val ilkfragment = BlankFragment()
        fragmentTransaction.replace(R.id.frameLayout,ilkfragment).commit()
    }

    fun ikincifragment(view: View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction() //İşlem yapmaya başlıyoruz

        val ikincifragment = BlankFragment2()
        fragmentTransaction.replace(R.id.frameLayout,ikincifragment).commit()
    }

}