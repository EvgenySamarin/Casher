package com.example.casher

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

/** TODO [2019.12.08] свяжи bottom navigation with android navigation component */
/**
 * Main screen of program contains base ui logic and navigation
 *
 * @author EvgenySamarin
 * @since 2019.12.08 v1
 */
class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar) //подключаем кастомный тулбар

        val host: NavHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
                as NavHostFragment? ?: return

        val navController = host.navController
        navController.graph = navController.navInflater.inflate(R.navigation.nav_graph_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)

        toolbar?.let { setupActionBarWithNavController(navController, appBarConfiguration) }

        bottom_nav_view?.setupWithNavController(navController) // bind bottom nav with navigation
    }

    override fun onSupportNavigateUp(): Boolean =
        findNavController(R.id.nav_host_fragment).navigateUp(appBarConfiguration)
}
