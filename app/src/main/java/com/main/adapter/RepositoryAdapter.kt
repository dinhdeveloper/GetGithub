package com.main.adapter

import android.content.Context
import android.graphics.Color
import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.main.activity.R
import com.main.model.Repositories
import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

class RepositoryAdapter
    (
    private val context: Context?,
    private val reposList: List<Repositories>,
    private val itemClick: (Repositories) -> Unit
) : RecyclerView.Adapter<RepositoryAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view =
            LayoutInflater.from(context).inflate(R.layout.custom_item_repos, parent, false)
        return ViewHolder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return reposList.size
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (context != null) {
//            val current = reposList[position].getUpdatedAt()
//            val format = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
//            val formatted = current?.format(format)

            holder.txtName?.text = reposList[position].getName()
            holder.language?.text = reposList[position].getLanguage()
            holder.loginName?.text = reposList[position].getOwner()?.getLogin()
            holder.startCount?.text = reposList[position].getStargazersCount().toString()
            Glide.with(context).load(reposList[position].getOwner()?.getAvatarUrl())
                .into(holder.avatarUrl!!)
            if (reposList[position].getDescription() == null) {
                holder.desCription?.visibility = View.GONE
            } else {
                holder.desCription?.text = reposList[position].getDescription().toString()
            }

        }
    }

    inner class ViewHolder(
        itemView: View,
        private val itemClick: (Repositories) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {
        var txtName: TextView? = itemView?.findViewById(R.id.name)
        var language: TextView? = itemView?.findViewById(R.id.language)
        var desCription: TextView? = itemView?.findViewById(R.id.description)
        var loginName: TextView? = itemView?.findViewById(R.id.loginName)
        var avatarUrl: ImageView? = itemView?.findViewById(R.id.avatar_url)
        var startCount: TextView? = itemView?.findViewById(R.id.start_count)

        init {
            itemView?.setOnClickListener {
                itemClick?.invoke(reposList[adapterPosition])
            }
        }
    }
}