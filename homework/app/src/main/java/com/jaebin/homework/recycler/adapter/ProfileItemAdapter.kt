package com.jaebin.homework.recycler.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jaebin.homework.data.Profile
import com.jaebin.homework.databinding.ProfileitemBinding

class ProfileItemAdapter(val profile: Profile) :RecyclerView.Adapter<ProfileItemAdapter.ViewHolder>() {

    class ViewHolder(val item:ProfileitemBinding):RecyclerView.ViewHolder(item.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ProfileitemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val profileData = profile
        holder.item.searchContext.setText(profileData.questionBar)
    }

    override fun getItemCount(): Int = 1
}