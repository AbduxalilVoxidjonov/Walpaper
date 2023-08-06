package uc.team.walpaper

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import uc.team.walpaper.databinding.ItemListBinding
import uc.team.walpaper.ui.home.fragmentPager.RecycleViewListener

class CustomAdapterRecycleview(val list: List<String>):RecyclerView.Adapter<CustomAdapterRecycleview.MyViewHolder>() {
    private var recyclerView: RecycleViewListener? = null
    inner class MyViewHolder(val binding: ItemListBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(image: String) {
                Picasso.get().
                load(image)
                    .resize(150, 150)
                    .error(android.R.drawable.stat_notify_error)
                    .centerCrop().into(binding.imageView)
        }

        init {
            binding.root.setOnClickListener {
                recyclerView?.onItemClicked(adapterPosition)
            }
        }
    }
    fun recyclerView(listener: RecycleViewListener){
        recyclerView = listener
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return MyViewHolder(ItemListBinding.bind(itemView))

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(list[position])
    }
}