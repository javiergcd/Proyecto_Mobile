package com.rybeler.exampleviewmodel.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.rybeler.exampleviewmodel.databinding.FragmentThirdBinding
import com.rybeler.exampleviewmodel.ui.adapters.ComicsAdapter
import com.rybeler.exampleviewmodel.ui.viewModel.ThirdViewModel

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding
    private val args: ThirdFragmentArgs by navArgs()
    private val viewModel: ThirdViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.titleTextThird.text = args.tituloTextThird

        viewModel.comics.observe(viewLifecycleOwner) {updatedList ->
            binding.recyclerThird.adapter = ComicsAdapter(updatedList)
        }
    }
}