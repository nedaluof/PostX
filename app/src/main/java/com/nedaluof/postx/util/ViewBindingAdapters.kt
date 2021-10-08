package com.nedaluof.postx.util

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nedaluof.entities.Post
import com.nedaluof.postx.ui.MainAdapter

/**
 * Created by nedaluof on 2/6/2021.
 */
object ViewBindingAdapters {

    @JvmStatic
    @BindingAdapter("data")
    fun data(recyclerView: RecyclerView?, list: List<Post>) {
        if (recyclerView != null) {
            recyclerView.adapter  = MainAdapter().also {
                it.addData(list)
            }
        }
    }
}