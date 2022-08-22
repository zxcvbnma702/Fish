package com.example.fish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.base.ui.activity.BaseUIActivity
import com.example.base.ui.bar.BottomNavigationBar
import com.example.base.ui.util.toast
import com.example.fish.ui.cart.CartFragment
import com.example.fish.ui.home.HomeFragment
import com.example.fish.ui.message.MessageFragment
import com.example.fish.ui.person.PersonFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : BaseUIActivity() {

    private val bottomNavView: BottomNavigationView by lazy{
        findViewById(R.id.bottomNavigationView)
    }
    private val floatButton: FloatingActionButton by lazy {
        findViewById(R.id.float_button)
    }
    private lateinit var home: Fragment
    private lateinit var cart: Fragment
    private lateinit var message: Fragment
    private lateinit var person: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFragment()
        initView()
    }

    private fun initFragment() {
        home = HomeFragment()
        message = MessageFragment()
        cart = CartFragment()
        person = PersonFragment()
    }

    private fun initView() {
        setCurrentFragment(home)

        floatButton.setOnClickListener {
            toast("添加商品")
        }

        bottomNavView.background = null
        bottomNavView.menu.getItem(2).isEnabled = false
        bottomNavView.setOnItemSelectedListener {
            when(it.itemId){
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

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container_fragment, fragment)
            commit()
        }
}