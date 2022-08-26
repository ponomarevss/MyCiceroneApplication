package com.example.myciceroneapplication

import com.example.myciceroneapplication.fragment.AFragment
import com.example.myciceroneapplication.fragment.BFragment
import com.example.myciceroneapplication.fragment.CFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

class AndroidScreens : IScreens {

    override fun a() = FragmentScreen { AFragment.newInstance() }
    override fun b() = FragmentScreen { BFragment.newInstance() }
    override fun c() = FragmentScreen { CFragment.newInstance() }
}