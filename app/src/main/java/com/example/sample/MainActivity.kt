package com.example.sample

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.widget.NestedScrollView
import androidx.core.widget.NestedScrollView.INVISIBLE
import androidx.core.widget.NestedScrollView.OnScrollChangeListener
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val arrayList = ArrayList<suitcase>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        addData(R.drawable.ic_daily,"Daily Items")
        addData(R.drawable.ic_fruit,"Fruits")
        addData(R.drawable.ic_commerce,"Dairy Products")
        addData(R.drawable.ic_chips,"Packed Food")
        addData(R.drawable.ic_food,"Flour")


        val layoutManager= GridLayoutManager(this, 3)


        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = RecyclerViewAdapter(this,arrayList);
        scrollable.setOnScrollChangeListener { v: NestedScrollView?, scrollX: Int, scrollY: Int, oldScrollX: Int, oldScrollY: Int ->
            if (scrollY>50)
                main_toolbar.visibility = View.INVISIBLE
            else
                main_toolbar.visibility = View.VISIBLE
        }

    }

    fun addData(img: Int,text: String){
        val su= suitcase(img,text)
        arrayList.add(su)
    }
}



