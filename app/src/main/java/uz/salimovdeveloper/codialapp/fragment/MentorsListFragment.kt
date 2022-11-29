package uz.salimovdeveloper.codialapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.salimovdeveloper.codialapp.R
import uz.salimovdeveloper.codialapp.databinding.FragmentMentorsListBinding

class MentorsListFragment : Fragment() {
    private lateinit var binding: FragmentMentorsListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMentorsListBinding.inflate(layoutInflater)


        return binding.root
    }

}