package com.example.navigationdrawer

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout : DrawerLayout
    lateinit var navigationView : NavigationView
    lateinit var toolBar : androidx.appcompat.widget.Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawerLayout)
        navigationView = findViewById(R.id.navigationView)
        toolBar = findViewById(R.id.toolBar)

//        step 1

        setSupportActionBar(toolBar)

        val actionBarToggle = ActionBarDrawerToggle(this, drawerLayout,toolBar,R.string.OpenDrawer, R.string.CloseDrawer)
        val drawerLayout = drawerLayout.addDrawerListener(actionBarToggle)

        val syncState = actionBarToggle.syncState()



    }
}
