package com.example.casher.view.ui.core

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.casher.R

/**
 * The abstract base activity which contains common logic.
 * Every Activity should has following ids:
 * - nav_host_fragment is NavHostFragment
 * - navGraphId is appropriate Navigation graph layout
 * - toolbar is Toolbar wrapped by AppBarLayout
 *
 * @author EvgenySamarin
 * @since 2019.12.09 v1
 */
abstract class BaseActivity : AppCompatActivity() {
    abstract var navGraphId: Int
    abstract var contentId: Int

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(contentId)

        val toolbar = window.decorView.findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val host: NavHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
                as NavHostFragment? ?: return

        val navController = host.navController
        navController.graph = navController.navInflater.inflate(navGraphId)
        appBarConfiguration = AppBarConfiguration(navController.graph)

        if (toolbar != null) setupActionBarWithNavController(navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.nav_host_fragment).navigateUp(appBarConfiguration)
    }
}