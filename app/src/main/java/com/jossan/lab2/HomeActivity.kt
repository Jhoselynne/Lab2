package com.jossan.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val greetingsFragment = GreetingsFragment()
        val infoFragment = InfoFragment()

        // First fragment that shows - Hello World Page
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, greetingsFragment)
            commit()
        }

        // if info fragment - then switch to greetings fragment
        val btnFragment1 = findViewById<Button>(R.id.btnFragment1)
        btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, greetingsFragment)
                addToBackStack(null)
                commit()
            }
        }

        // if greetings fragment - then switch to info fragment
        val btnFragment2 = findViewById<Button>(R.id.btnFragment2)
        btnFragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, infoFragment)
                addToBackStack(null)
                commit()
            }
        }

        // navigates to City Recycler View
        val btnRecyclerView = findViewById<Button>(R.id.btnRecycler)
        btnRecyclerView.setOnClickListener{

            // the activity (View) to change to
            val intent = Intent(this, RecyclerActivity::class.java)

            // change activity
            startActivity(intent)
        }
    }
}