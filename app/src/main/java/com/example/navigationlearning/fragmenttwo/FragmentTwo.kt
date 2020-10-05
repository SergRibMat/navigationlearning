package com.example.navigationlearning.fragmenttwo

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navigationlearning.R
import com.example.navigationlearning.databinding.FragmentTwoFragmentBinding

class FragmentTwo : Fragment() {

    private lateinit var binding: FragmentTwoFragmentBinding

    companion object {
        fun newInstance() = FragmentTwo()
    }

    private lateinit var viewModel: FragmentTwoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_two_fragment, container, false)
        goToFragmentThree()
        val args = FragmentTwoArgs.fromBundle(requireArguments())
        binding.tvValue.text = args.num.toString()
        return binding.root
    }
    /*
    Navigation can create the onClick listener for us. We can replace the anonymous function with the Navigation.createNavigateOnClickListener call.
    * The complete onClickListener with Navigation using createNavigateOnClickListener
        binding.playButton.setOnClickListener(
        Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment))
*/

    private fun goToFragmentThree() {
        binding.buttonToFragmentThree.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_FragmentTwoNavigation_to_FragmentThreeNavigation)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FragmentTwoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}