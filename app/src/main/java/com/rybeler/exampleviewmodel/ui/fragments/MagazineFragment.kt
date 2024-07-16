package com.rybeler.exampleviewmodel.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.rybeler.exampleviewmodel.databinding.FragmentMagazineBinding
import com.rybeler.exampleviewmodel.ui.adapters.MagazineAdapter
import com.rybeler.exampleviewmodel.ui.viewModel.MagazineViewModel

class MagazineFragment: Fragment() {

    private lateinit var binding: FragmentMagazineBinding
    private val args: MagazineFragmentArgs by navArgs()
    private val viewModel: MagazineViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMagazineBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.titleTextMagazine.text = args.tituloTextMagazine

        viewModel.magazines.observe(viewLifecycleOwner) { updatedList ->
            binding.recyclerMagazine.adapter = MagazineAdapter(updatedList)
        }
    }
}