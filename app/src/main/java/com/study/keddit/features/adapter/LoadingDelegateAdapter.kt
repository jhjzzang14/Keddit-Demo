package com.study.keddit.features.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.study.keddit.R
import com.study.keddit.commons.adapter.ViewType
import com.study.keddit.commons.adapter.ViewTypeDelegateAdapter
import com.study.keddit.commons.extensions.inflate

/**
 * Created by hojun on 2017-08-02.
 */
class LoadingDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder = LoadingViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {

    }
    class LoadingViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading))

}