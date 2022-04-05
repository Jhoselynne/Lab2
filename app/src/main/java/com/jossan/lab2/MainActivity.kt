package com.jossan.lab2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // user objects
        val admin = User("Admin", "admin@jossai.com", "admin123")
        val jossan = User("Jossan", "jossan@gmail.com", "abc123")
        val saiman = User("Saiman", "saiman@gmail.com", "123abc")
        val kristoffer = User("Kristoffer", "kristoffer@krillinator.com", "krillinator")

        // user arrayList
        val userArrayList = ArrayList<User>()

        // add users
        userArrayList.add(admin)
        userArrayList.add(jossan)
        userArrayList.add(saiman)
        userArrayList.add(kristoffer)

        // inputs findViewById
        val inputEmail = findViewById<EditText>(R.id.inputEmail)
        val inputPassword = findViewById<EditText>(R.id.inputPassword)

        // button findViewById
        val loginBtn = findViewById<Button>(R.id.buttonLogin)

        // what happens when clicking loginBTN
        loginBtn.setOnClickListener{
            var boolErrorToast = false
            for (user in userArrayList) {
                if(inputEmail.text.toString() == user.email && inputPassword.text.toString() == user.password){
                    // the activity (View) to change to
                    val intent = Intent(this, HomeActivity::class.java)

                    // change activity
                    startActivity(intent)
                    Toast.makeText(this, "Welcome ${user.name}", Toast.LENGTH_SHORT).show()
                    boolErrorToast = false
                    break
                } else {
                    boolErrorToast = true
                }
            }
            // if boolErrorToast is set to true then show Toast
            if(boolErrorToast) {
                Toast.makeText(this, "Wrong E-mail or Password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}