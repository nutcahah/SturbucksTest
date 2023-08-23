package com.example.instagramtest.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.instagramtest.R
import com.example.instagramtest.model.StarbuckCoffeeModel

class StarbucksCoffeeAdapter(
    private val features: List<StarbuckCoffeeModel>
) : RecyclerView.Adapter<StarbucksCoffeeAdapter.DashboardViewHolder>() {

    inner class DashboardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val picture: ImageView = itemView.findViewById(R.id.imageView2)
        val textTitle: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_starbuck_coffee, parent, false)
        return DashboardViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return features.size
    }

    override fun onBindViewHolder(holder: DashboardViewHolder, position: Int) {
        val currentItem = features[position]

        holder.textTitle.text = currentItem.cityMain

        Glide.with(holder.picture.context)
            .load(currentItem.imageUrlMain)
            .into(holder.picture)

        holder.itemView.setOnClickListener {

            when (currentItem.cityId) {
                1 -> {
//                    val intent = Intent(it.context, CityActivity::class.java)
//                    intent.putExtra("currentItem", currentItem)
//                    it.context.startActivity(intent)

                }
                2 -> {
//                    val intent = Intent(it.context, CityActivity::class.java)
//                    intent.putExtra("currentItem", currentItem)
//                    it.context.startActivity(intent)

                }
                3 -> {
//                    val intent = Intent(it.context, CityActivity::class.java)
//                    intent.putExtra("currentItem", currentItem)
//                    it.context.startActivity(intent)
                }
                4 -> {
//                    val intent = Intent(it.context, CityActivity::class.java)
//                    intent.putExtra("currentItem", currentItem)
//                    it.context.startActivity(intent)
                }
            }
        }
    }
}