package uz.salimovdeveloper.codialapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.salimovdeveloper.codialapp.R
import uz.salimovdeveloper.codialapp.databinding.FragmentMentorAddBinding

class MentorAddFragment : Fragment() {
    private lateinit var binding: FragmentMentorAddBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMentorAddBinding.inflate(layoutInflater)


        return binding.root
    }
}