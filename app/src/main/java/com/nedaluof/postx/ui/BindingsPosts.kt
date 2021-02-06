package com.nedaluof.postx.ui

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nedaluof.entities.Post

/**
 * Created by nedaluof on 2/6/2021.
 */
class BindingsPosts {
    companion object {
        @BindingAdapter("items")
        @JvmStatic
        fun bindData(recyclerView: RecyclerView, list: List<Post>?) {
            val postAdapter: MainAdapter = recyclerView.adapter as MainAdapter
            if (!list.isNullOrEmpty())
                postAdapter.addData(list)
        }
    }
}