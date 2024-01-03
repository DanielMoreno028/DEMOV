package com.movieaplication.movieaplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.movieaplication.movieaplication.databinding.ActivityHomeBinding
class Activity_home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){

                R.id.homee -> replaceFragment(HomeFragment())
                R.id.searchh -> replaceFragment(SearchFragment())
                R.id.playy -> replaceFragment(PlayFragment())
                R.id.accountt -> replaceFragment(AccountFragment())

                else ->{

                }
            }

            true

        }

    }

    private fun replaceFragment(fragment : Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentparent,fragment)
        fragmentTransaction.commit()
    }
}
