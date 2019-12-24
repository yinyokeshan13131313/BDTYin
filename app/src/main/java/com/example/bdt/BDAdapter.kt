package com.example.bdt

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BDAdapter internal constructor(context: Context) : RecyclerView.Adapter<BDAdapter.BDViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var bds = emptyList<BD>() // Cached copy of birthday

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BDViewHolder {
        val itemView = inflater.inflate(R.layout.recyclerview_item, parent, false)
        return BDViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return bds.size
    }

    override fun onBindViewHolder(holder: BDViewHolder, position: Int) {
        val bdRecord = bds.get(position)

        holder.textViewName.text = bdRecord.name
        holder.textViewDOB.text = bdRecord.dob
    }


    inner  class BDViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewName: TextView = itemView.findViewById(R.id.textViewName)
        val textViewDOB: TextView = itemView.findViewById(R.id.textViewDOB)
    }

    internal fun setBDS(words: List<BD>) {
        this.bds = bds
        notifyDataSetChanged()
    }
}