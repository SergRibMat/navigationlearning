package com.example.navigationlearning.fragmentone

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.navigationlearning.R
import com.example.navigationlearning.databinding.FragmentOneFragmentBinding

class FragmentOne : Fragment() {

    private lateinit var  binding: FragmentOneFragmentBinding

    companion object {
        fun newInstance() = FragmentOne()
    }

    private lateinit var viewModel: FragmentOneViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_one_fragment, container, false)
        goToFragmentTwo()
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentOneViewModel::class.java)
        // TODO: Use the ViewModel
    }

    fun goToFragmentTwo(){
        binding.buttonToFragmentTwo.setOnClickListener { view: View ->
            view.findNavController().navigate(
                FragmentOneDirections.actionFragmentOneNavigationToFragmentTwoNavigation(
                    fromStringToIntegerOrNull(getEditTextNumber())?: 0
                )
            )
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }

    fun getEditTextNumber(): String = binding.etNumber.text.toString()

    fun fromStringToIntegerOrNull(text: String): Int? = text.toIntOrNull()
}