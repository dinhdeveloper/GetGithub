package com.main.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.main.activity.R
import com.main.model.Branch

class BranchAdapter
    (
    private val context: Context?,
    private val reposList: List<Branch>,
    private val itemClick: (Branch) -> Unit
) : RecyclerView.Adapter<BranchAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BranchAdapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: BranchAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    inner class ViewHolder(
        itemView: View,
        private val itemClick: (Branch) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {
        var txtName: TextView? = itemView?.findViewById(R.id.name)
        var language: TextView? = itemView?.findViewById(R.id.language)
        var pushedAt: TextView? = itemView?.findViewById(R.id.username)

        init {
            itemView?.setOnClickListener {
                itemClick?.invoke(reposList[adapterPosition])
            }
        }
    }
}