package com.example.base.ui.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.example.base.ui.`interface`.BaseBinding
import com.example.base.ui.kxt.getViewBinding

/**
 * @author:SunShibo
 * @date:2022-09-27 20:05
 * @feature:
 */
abstract class BaseFragment<VB : ViewDataBinding> : Fragment(), BaseBinding<VB> {
    protected lateinit var binding: VB
        private set

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = getViewBinding(inflater, container)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.initBindingView()
    }

    override fun onDestroy() {
        super.onDestroy()
        if (!::binding.isInitialized) return
        binding.unbind()
    }
}