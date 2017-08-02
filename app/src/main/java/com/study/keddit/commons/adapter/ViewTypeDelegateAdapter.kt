package com.study.keddit.commons.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by hojun on 2017-08-02.
 */

interface ViewTypeDelegateAdapter{
    fun onCreateViewHolder(parent : ViewGroup) : RecyclerView.ViewHolder

    fun onBindViewHolder(holder : RecyclerView.ViewHolder, item: ViewType)
}