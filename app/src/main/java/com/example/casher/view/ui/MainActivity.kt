package com.example.casher.view.ui

import com.example.casher.R
import com.example.casher.view.ui.core.BaseActivity

/**
 * Main screen of program contains base ui logic and navigation
 *
 * @author EvgenySamarin
 * @since 2019.12.08 v2
 */
class MainActivity : BaseActivity() {
    override var navGraphId = R.navigation.nav_graph_main
    override var contentId = R.layout.activity_main
}
