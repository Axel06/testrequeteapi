package com.example.testrequeteapi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.testrequeteapi.R.id.imageview
import com.squareup.picasso.Picasso

class ProductAdapter(private  val mList: List<Products>):RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_card,parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val products = mList[position]

        holder.textView.setText(products.title)
        Picasso.get().load(products.images.get(0)).into(holder.imageView)
    }


    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {

        val imageView: ImageView = ItemView.findViewById(imageview)
        val textView: TextView = ItemView.findViewById(R.id.textview)

    }


}