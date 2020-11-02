package com.example.RecycleView1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinlearningapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val examplelist=generateList(200)
        recycler_View.adapter=Adapter(examplelist)
        recycler_View.layoutManager= LinearLayoutManager(this)

        recycler_View.setHasFixedSize(true)
    }

    private fun generateList(size:Int):List<Item>{
        val list=ArrayList<Item>()
        for (i in 0 until size){
            val drawable=when (i % 4){
                0->R.drawable.java
                1->R.drawable.html
                2->R.drawable.kotlin
                else->R.drawable.python
            }
            val item=Item(drawable,"Item $i")
            list +=item
        }
        return list
    }
}

