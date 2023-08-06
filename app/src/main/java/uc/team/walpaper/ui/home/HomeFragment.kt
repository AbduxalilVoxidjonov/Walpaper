package uc.team.walpaper.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.tabs.TabLayoutMediator
import uc.team.walpaper.CustomAdapterRecycleview
import uc.team.walpaper.databinding.FragmentHomeBinding
import uc.team.walpaper.ui.home.fragmentPager.CustomAdapter

class HomeFragment : Fragment() {
private val binding by lazy{ FragmentHomeBinding.inflate(layoutInflater) }
    private lateinit var arrayList: ArrayList<String>
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val item = arrayListOf<String>(
            "All",
            "New",
            "Animal",
            "Technology",
            "Nature"
        )
        val customAdapter = CustomAdapter(this,item)
        binding.myViewPager.adapter= customAdapter

        TabLayoutMediator(binding.tableLayout,binding.myViewPager){ tab, position ->
            tab.text=item[position]
        }.attach()

    }
}