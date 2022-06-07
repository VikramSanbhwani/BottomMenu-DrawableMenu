package com.express.bottomnavigation

import android.os.Bundle
import android.os.PersistableBundle
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var navController: NavController
    private var navigationView: NavigationView? = null
//    lateinit var home_drawer: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        WorkAfterInitialization()
    }


    private fun initView() {
        home_drawer = findViewById(R.id.drawer_layout)
        navigationView = findViewById<NavigationView>(R.id.nav_view)
    }

    private fun WorkAfterInitialization() {
        navigationView?.setNavigationItemSelectedListener(this)

        val headerLayout = navigationView?.getHeaderView(0)
        val back_ll = headerLayout?.findViewById<LinearLayout>(R.id.ll_back)
        back_ll?.setOnClickListener(View.OnClickListener {
            home_drawer.closeDrawers()
        })


        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        // Setup the bottom navigation view with navController

        NavigationUI.setupWithNavController(bottomNavigationView, navController);



//        val navController = this.findNavController(R.id.nav_host_fragment)
//        // Find reference to bottom navigation view
//        val navView: BottomNavigationView = findViewById(R.id.bottom_nav_view)
//        // Hook your navigation controller to bottom navigation view
//        navView.setupWithNavController(navController)


    }

    companion object {
        lateinit var  home_drawer: DrawerLayout

    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)
    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        when (menuItem.itemId) {
            R.id.profile -> {
                menuItem.isChecked = true

                home_drawer.closeDrawers()

                Toast.makeText(this@MainActivity, "This is profile", Toast.LENGTH_SHORT).show()


                return true
            }

            R.id.share -> {

                menuItem.isChecked = true

                home_drawer.closeDrawers()

                Toast.makeText(this@MainActivity, "This is profile", Toast.LENGTH_SHORT).show()

                return true
            }
            R.id.subscribe -> {
                menuItem.isChecked = true

                home_drawer.closeDrawers()
                Toast.makeText(this@MainActivity, "This is profile", Toast.LENGTH_SHORT).show()

                return true
            }
            R.id.contact_us -> {
                menuItem.isChecked = true

                home_drawer.closeDrawers()

                Toast.makeText(this@MainActivity, "This is profile", Toast.LENGTH_SHORT).show()

                return true
            }
            R.id.feed_back -> {
                menuItem.isChecked = true

                home_drawer.closeDrawers()
                Toast.makeText(this@MainActivity, "This is profile", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.rate -> {
                menuItem.isChecked = true

                home_drawer.closeDrawers()

                Toast.makeText(this@MainActivity, "This is profile", Toast.LENGTH_SHORT).show()

                return true
            }
            R.id.about -> {
                menuItem.isChecked = true

                home_drawer.closeDrawers()
                Toast.makeText(this@MainActivity, "This is profile", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.terms -> {
                menuItem.isChecked = true

                home_drawer.closeDrawers()
                Toast.makeText(this@MainActivity, "This is profile", Toast.LENGTH_SHORT).show()
                return true
            }

        }
        return false
    }
}