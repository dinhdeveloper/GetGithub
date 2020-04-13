package com.main.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.main.activity.R
import com.main.model.Org
import com.main.model.Repositories

class OrganizationAdapter(
    private val context: Context?,
    private val orgList: List<Org>,
    private val itemClick: (Org) -> Unit
) : RecyclerView.Adapter<OrganizationAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view =
            LayoutInflater.from(context).inflate(R.layout.custom_item_organ, parent, false)
        return ViewHolder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return orgList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.userName?.text = orgList[position].getLogin().toString()
        holder.loginName?.text = orgList[position].getLogin().toString()
        if (context != null) {
            Glide.with(context).load(orgList[position].getAvatarUrl())
                .into(holder.imgOrgan!!)
        }
    }


    inner class ViewHolder(
        itemView: View,
        private val itemClick: (Org) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {
        var userName: TextView? = itemView?.findViewById(R.id.username)
        var loginName: TextView? = itemView?.findViewById(R.id.loginName)
        var imgOrgan: ImageView? = itemView?.findViewById(R.id.imgOrgan)

        init {
            itemView?.setOnClickListener {
                itemClick?.invoke(orgList[adapterPosition])
            }
        }
    }
}