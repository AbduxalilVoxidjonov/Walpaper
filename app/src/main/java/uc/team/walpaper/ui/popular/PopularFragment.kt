package uc.team.walpaper.ui.popular

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uc.team.walpaper.databinding.FragmentGalleryBinding

class PopularFragment : Fragment() {
    private val binding by lazy { FragmentGalleryBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return binding.root
    }


}