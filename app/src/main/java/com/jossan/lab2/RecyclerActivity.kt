package com.jossan.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {

    private val itemList = ArrayList<String>()
    private lateinit var customAdapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        val recyclerView: RecyclerView = findViewById(R.id.recycleView)
        customAdapter = CustomAdapter(itemList)
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = customAdapter
        prepareItems()
    }

    private fun prepareItems() {
        itemList.add("Stockholm")
        itemList.add("London")
        itemList.add("Lisbon")
        itemList.add("Paris")
        itemList.add("Hong Kong")
        itemList.add("Santiago")
        itemList.add("Bangkok")
        itemList.add("Sydney")
        itemList.add("Mogadishu")
        itemList.add("Mexico City")
        itemList.add("Panama City")
        itemList.add("Barcelona")
        itemList.add("Toronto")
        itemList.add("Johannesburg")
        itemList.add("Dubai")
        customAdapter.notifyDataSetChanged()
    }
}