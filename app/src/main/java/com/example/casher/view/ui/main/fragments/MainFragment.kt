package com.example.casher.view.ui.main.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.casher.R
import com.example.casher.databinding.FragmentMainBinding
import com.example.casher.model.entity.CasherItemEntity
import com.example.casher.view.App
import com.example.casher.viewmodel.MainViewModel

/**
 * Main fragment for showing list of cash checks
 *
 * @author EvgenySamarin
 * @since 2019.12.08 v1
 */
class MainFragment : Fragment() {
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        App.appComponent.inject(this)
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(
            inflater, R.layout.fragment_main, container, false
        )

        mainViewModel.checkerData.observe(this, Observer {
            binding.casherItem = it
        })

        binding.defaultText = "default text"
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainViewModel.getCheckerInfo()

        mainViewModel.updateCheckerData(CasherItemEntity("hello","qq","11"))
    }
}
