package com.example.myciceroneapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myciceroneapplication.databinding.ActivityMainBinding
import com.github.terrakok.cicerone.androidx.AppNavigator

class MainActivity : AppCompatActivity() {

//    private val navigatorHolder = App.instance.navigatorHolder
//    private val router = App.instance.router
    private val screens: IScreens = AndroidScreens()
    private val navigator = AppNavigator(this, R.id.container)
    private var vb: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)
        App.instance.router.replaceScreen(screens.a())
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        App.instance.navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        App.instance.navigatorHolder.removeNavigator()
    }
}