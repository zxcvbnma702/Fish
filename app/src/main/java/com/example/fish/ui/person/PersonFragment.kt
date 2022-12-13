package com.example.fish.ui.person

import com.example.base.ui.activity.BaseFragment
import com.example.fish.databinding.FragmentPersonBinding


class PersonFragment : BaseFragment<FragmentPersonBinding>() {
    override fun FragmentPersonBinding.initBindingView() {
        settingButton.setOnClickListener {
            context?.let { it1 -> SettingActivity.startActivity(it1) }
        }
    }
}