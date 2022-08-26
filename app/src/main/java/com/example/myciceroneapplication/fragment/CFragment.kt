package com.example.myciceroneapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myciceroneapplication.databinding.FragmentCBinding

class CFragment: Fragment() {

    companion object{
        fun newInstance() = CFragment()
    }

    private var vb: FragmentCBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentCBinding.inflate(inflater, container, false).also {
        vb = it
    }.root

    override fun onDestroyView() {
        super.onDestroyView()
        vb = null
    }
}