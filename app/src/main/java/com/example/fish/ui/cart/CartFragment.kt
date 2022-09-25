package com.example.fish.ui.cart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.base.ui.util.toast
import com.example.fish.FishApplication
import com.example.fish.R
import com.example.fish.databinding.FragmentCartBinding
import com.example.fish.logic.network.model.SaveListRecord
import com.example.fish.ui.cart.adapter.CartRecyclerAdapter
import kotlinx.coroutines.*

class CartFragment : Fragment(), CartListener,  SwipeRefreshLayout.OnRefreshListener {

    private lateinit var binding: FragmentCartBinding
    private lateinit var myAdapter: CartRecyclerAdapter
    internal val viewModel: CartViewModel by lazy{
        ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(CartViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cart, container, false)
        binding.viewModel = viewModel
        viewModel.cartListener = this

        initView()
        return binding.root
    }

    private fun initView() {
        myAdapter = CartRecyclerAdapter(this)

        viewModel.getSaveList()

        binding.cartRecyclerView.adapter = myAdapter

        binding.cartSwipe.apply{
            setColorSchemeColors(resources.getColor(R.color.main_color),
                resources.getColor(R.color.purple_200),
                resources.getColor(R.color.teal_200))
            setOnRefreshListener (this@CartFragment)
        }
    }

    /**
     * Update recyclerview data
     */
    override fun onSaveListResponse(saveList: LiveData<Result<List<SaveListRecord>>>) {
        saveList.observe(this){result ->
            val list = result.getOrNull()
            if (list != null) myAdapter.data = list
        }
    }

    /**
     * Send saved data
     */
    override fun onPostSaveResponse(response: LiveData<Result<Int>>) {
        response.observe(this){result ->
            val code = result.getOrNull()
            if(code != null){
                FishApplication.context.toast(R.string.cart_send_success)
            }else{
                FishApplication.context.toast(R.string.cart_send_failure)
            }
        }
    }

    /**
     * Refresh data using coroutines
     * Updating the UI in a coroutine on the main thread
     */
    override fun onRefresh() {
        viewModel.getSaveList()
        val job = Job()
        CoroutineScope(job).launch {
            withContext(Dispatchers.Main){
                delay(2000)
                binding.cartSwipe.isRefreshing = false
                FishApplication.context.toast(R.string.cart_refresh)
            }
        }
    }
}