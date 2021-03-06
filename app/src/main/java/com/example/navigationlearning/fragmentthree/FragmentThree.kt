package com.example.navigationlearning.fragmentthree

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationlearning.R

class FragmentThree : Fragment() {

    companion object {
        fun newInstance() = FragmentThree()
    }

    private lateinit var viewModel: FragmentThreeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_three_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FragmentThreeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}