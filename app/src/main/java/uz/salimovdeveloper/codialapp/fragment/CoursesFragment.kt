package uz.salimovdeveloper.codialapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.salimovdeveloper.codialapp.R
import uz.salimovdeveloper.codialapp.databinding.FragmentCoursesBinding

class CoursesFragment : Fragment() {
    private lateinit var binding: FragmentCoursesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCoursesBinding.inflate(layoutInflater)

        return binding.root
    }
}