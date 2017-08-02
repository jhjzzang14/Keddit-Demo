package com.study.keddit.features.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.study.keddit.R
import com.study.keddit.commons.RedditNewsItem
import com.study.keddit.commons.adapter.ViewType
import com.study.keddit.commons.adapter.ViewTypeDelegateAdapter
import com.study.keddit.commons.extensions.getFriendlyTime
import com.study.keddit.commons.extensions.inflate
import com.study.keddit.commons.extensions.loadImg
import kotlinx.android.synthetic.main.news_item.view.*
/**
 * Created by hojun on 2017-08-02.
 */

class NewsDelegateAdapter : ViewTypeDelegateAdapter {


    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return TurnsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            //Picasso.with(itemView.context).load(item.thumbnail).into(img_thumbnail)
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()
        }
    }
}
