package com.rybeler.exampleviewmodel.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.rybeler.exampleviewmodel.MainViewModel
import com.rybeler.exampleviewmodel.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var  binding: FragmentFirstBinding
    private val viewModel: MainViewModel by viewModels() // delegates


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /*binding.counterText.text = viewModel.contador.value.toString()

        binding.increaseButton.setOnClickListener {
            viewModel.updateContador(1)
        }

        viewModel.contador.observe(viewLifecycleOwner) {
            updateText()
        }*/

        binding.navegarButton.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("PERSONAJES MARVEL")
            findNavController().navigate(action)
        }

        binding.navegarComics.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToThirdFragment("COMICS MARVEL")
            findNavController().navigate(action)
        }

        binding.navegarMagazines.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToMagazineFragment("REVISTAS MARVEL")
            findNavController().navigate(action)
        }
    }
}