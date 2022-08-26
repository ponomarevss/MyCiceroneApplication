package com.example.myciceroneapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myciceroneapplication.AndroidScreens
import com.example.myciceroneapplication.App
import com.example.myciceroneapplication.IScreens
import com.example.myciceroneapplication.databinding.FragmentABinding

class AFragment: Fragment() {

    companion object{
        fun newInstance() = AFragment()
    }

//    private val router = App.instance.router
    private val screens: IScreens = AndroidScreens()
    private var vb: FragmentABinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentABinding.inflate(inflater, container, false).also {
        vb = it
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vb?.btnToB?.setOnClickListener {
            App.instance.router.navigateTo(screens.b())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        vb = null
    }
}