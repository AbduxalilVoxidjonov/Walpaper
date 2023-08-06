package uc.team.walpaper.ui.like

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import uc.team.walpaper.CustomAdapterRecycleview
import uc.team.walpaper.R
import uc.team.walpaper.databinding.FragmentLikeBinding
import uc.team.walpaper.ui.home.fragmentPager.CustomAdapter


class LikeFragment : Fragment() {
    private val binding by lazy { FragmentLikeBinding.inflate(layoutInflater) }
    lateinit var arrayList: ArrayList<String>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        arrayList = ArrayList()
        arrayList.add(arguments?.getString("like").toString())
        val customAdapter = CustomAdapterRecycleview(arrayList)
        binding.recyclerView.layoutManager = GridLayoutManager(context, 3)
        binding.recyclerView.adapter = customAdapter

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }


}