package com.study.keddit.commons

/**
 * Created by hojun on 2017-08-02.
 */
import android.os.Parcel
import android.os.Parcelable
import com.study.keddit.commons.adapter.AdapterConstants
import com.study.keddit.commons.adapter.ViewType

data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String?
) : ViewType{
    override fun getViewType() = AdapterConstants.NEWS
}