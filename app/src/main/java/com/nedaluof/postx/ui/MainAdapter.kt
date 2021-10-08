package com.nedaluof.postx.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nedaluof.entities.Post
import com.nedaluof.postx.databinding.ItemPostBinding

/**
 * Created by nedaluof on 2/6/2021.
 */
class MainAdapter : RecyclerView.Adapter<MainAdapter.VH>() {

    private val dataList = ArrayList<Post>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        VH(ItemPostBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bindNow(dataList[position])
    }

    override fun getItemCount() = dataList.size

    @SuppressLint("NotifyDataSetChanged")
    fun addData(list: List<Post>) {
        dataList.addAll(list)
        notifyDataSetChanged()
    }

    class VH(private val binding: ItemPostBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindNow(post: Post) {
            binding.post = post
            binding.executePendingBindings()
        }
    }
}