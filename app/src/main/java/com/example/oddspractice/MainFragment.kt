package com.example.oddspractice

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.oddspractice.databinding.FragmentMainBinding
import com.example.oddspractice.model.MainData


class MainFragment : Fragment(), MainFragmentView {

    private val binding by lazy { FragmentMainBinding.inflate(layoutInflater) }
    private val presenter by lazy { MainPresenter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.attachView(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextPageButton.setOnClickListener() {
            presenter.validateName(binding.editText.text.toString())
        }
    }

    override fun changeColorText() {
        binding.editText.setTextColor(resources.getColor(R.color.red, null))
    }

    override fun navToNextPage(data: MainData) {
        findNavController().apply {
            navigate(
                R.id.page2Fragment,
                bundleOf(MainActivity.EXTRA_MAIN to data)
            )
        }
    }

}