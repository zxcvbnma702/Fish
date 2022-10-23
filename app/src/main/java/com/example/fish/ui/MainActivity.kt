package com.example.fish.ui

import android.content.Context
import android.content.Intent
import androidx.fragment.app.Fragment
import com.example.base.ui.activity.BaseActivity
import com.example.fish.R
import com.example.fish.databinding.ActivityMainBinding
import com.example.fish.ui.append.BottomSheetFragment
import com.example.fish.ui.cart.CartFragment
import com.example.fish.ui.home.HomeFragment
import com.example.fish.ui.message.MessageFragment
import com.example.fish.ui.person.PersonFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private lateinit var home: Fragment
    private lateinit var cart: Fragment
    private lateinit var message: Fragment
    private lateinit var person: Fragment

    private fun initFragment() {
        home = HomeFragment()
        message = MessageFragment()
        cart = CartFragment()
        person = PersonFragment()
    }

    override fun ActivityMainBinding.initBindingView() {
        initFragment()

        setCurrentFragment(home)

        floatButton.setOnClickListener {
            BottomSheetFragment().show(supportFragmentManager, "Append")
        }

        bottomNavigationView.apply {
            background = null
            menu.getItem(2).isEnabled = false
            setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.nav_home -> {
                        setCurrentFragment(home)
                        true
                    }
                    R.id.nav_cart -> {
                        setCurrentFragment(cart)
                        true
                    }
                    R.id.nav_message -> {
                        setCurrentFragment(message)
                        true
                    }
                    R.id.nav_person -> {
                        setCurrentFragment(person)
                        true
                    }
                    else -> {
                        true
                    }
                }
            }
        }
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container_fragment, fragment)
            commit()
        }

    companion object{
        fun startActivity(context: Context){
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }
    }
}