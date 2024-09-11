package com.example.recycleimageview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.recycleimageview.databinding.NameMainBinding

class Adapter(val number: man):ListAdapter<man,ItemviewHolder>(comparator){
      override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemviewHolder {
          return ItemviewHolder(NameMainBinding.inflate(LayoutInflater.from(parent.context),parent,false))
      }

      override fun onBindViewHolder(holder: ItemviewHolder, position: Int) {
          getItem(position).let {
              holder.binding.image.setImageResource(getItem(position).image)
              holder.binding.eggTV.text= getItem(position).number
          }
      }
      companion object{
          var comparator = object :DiffUtil.ItemCallback<man>(){
              override fun areItemsTheSame(oldItem: man, newItem: man): Boolean {
                 return oldItem == newItem
              }

              override fun areContentsTheSame(oldItem: man, newItem: man): Boolean {
                 return oldItem == newItem
              }

          }
      }
  }

