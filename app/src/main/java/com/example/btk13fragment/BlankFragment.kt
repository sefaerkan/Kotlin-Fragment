package com.example.btk13fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BlankFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { //Bir görünüm döndürmemizi istiyor.
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        return view
    }
}