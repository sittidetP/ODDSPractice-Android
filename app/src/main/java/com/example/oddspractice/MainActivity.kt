package com.example.oddspractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.example.oddspractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val nav = supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
        val navController = nav.navController
        navController.setGraph(
            R.navigation.main_navigation,
        )
    }

    companion object {
        const val EXTRA_MAIN = "EXTRA_MAIN"
    }
}