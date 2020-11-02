package com.example.RecycleView1

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinlearningapp.R
import kotlinx.android.synthetic.main.item.view.*

class Adapter(private val exampeList:  List<Item>): RecyclerView.Adapter<Adapter.ExampleViewHolder>() {
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
         val itemView= LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
         return ExampleViewHolder(itemView)
     }



     override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
         val currentItem=exampeList[position]
         holder.imageView.setImageResource(currentItem.ImageResource)
         holder.textView.text=currentItem.text
         if(position==0){
             holder.textView.setBackgroundColor(Color.CYAN)          //when background color change
         }
         else{
             holder.textView.setBackgroundColor(Color.BLUE)
         }



     }
     override fun getItemCount()=exampeList.size

     class ExampleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
         val imageView: ImageView =itemView.imageView
         val textView: TextView =itemView.tv


     }
 }


