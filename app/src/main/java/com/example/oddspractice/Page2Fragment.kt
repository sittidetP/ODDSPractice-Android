package com.example.oddspractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.oddspractice.databinding.FragmentPage2Binding
import com.example.oddspractice.model.MainData


class Page2Fragment : Fragment() {
    private val binding by lazy {FragmentPage2Binding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind()
    }

    fun bind(){
        var data  = arguments?.getParcelable<MainData>(MainActivity.EXTRA_MAIN)
        with(binding){
            textView.text = data?.text
        }
    }

}