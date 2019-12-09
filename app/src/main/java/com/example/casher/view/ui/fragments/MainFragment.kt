package com.example.casher.view.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.example.casher.R
import com.example.casher.databinding.FragmentMainBinding
import com.example.casher.viewmodel.MainViewModel

/**
 * Main fragment for showing list of cash checks
 *
 * @author EvgenySamarin
 * @since 2019.12.08 v1
 */
class MainFragment : Fragment() {

    lateinit var mainViewModel: MainViewModel



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(
            inflater, R.layout.fragment_main, container, false
        )

        binding.defaultText = "default text"

        return binding.root
    }

    @BindingAdapter("app:onClick")
    fun bindOnClick(view: View, onClick: () -> Unit){
        view.setOnClickListener { onClick() }
    }
}
