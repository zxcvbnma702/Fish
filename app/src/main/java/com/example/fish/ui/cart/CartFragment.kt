package com.example.fish.ui.cart

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.base.ui.activity.BaseFragment
import com.example.base.ui.kxt.toast
import com.example.fish.FishApplication
import com.example.fish.R
import com.example.fish.databinding.FragmentCartBinding
import com.example.fish.logic.network.model.SaveListRecord
import com.example.fish.ui.cart.adapter.CartRecyclerAdapter
import kotlinx.coroutines.*

class CartFragment : BaseFragment<FragmentCartBinding>(), CartListener,
    SwipeRefreshLayout.OnRefreshListener {

    private lateinit var myAdapter: CartRecyclerAdapter
    internal val mViewModel: CartViewModel by lazy {
        ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(CartViewModel::class.java)
    }

    override fun FragmentCartBinding.initBindingView() {
        binding.viewModel = mViewModel
        mViewModel.cartListener = this@CartFragment

        myAdapter = CartRecyclerAdapter(this@CartFragment)

        mViewModel.getSaveList()

        cartRecyclerView.adapter = myAdapter

        cartSwipe.apply {
            setColorSchemeColors(
                resources.getColor(R.color.main_color),
                resources.getColor(R.color.purple_200),
                resources.getColor(R.color.teal_200)
            )
            setOnRefreshListener(this@CartFragment)
        }
    }

    /**
     * Update recyclerview data
     */
    override fun onSaveListResponse(saveList: LiveData<Result<List<SaveListRecord>>>) {
        saveList.observe(this){result ->
            val list = result.getOrNull()
            if (list != null) myAdapter.setData(list)
        }
    }

    /**
     * Send saved data
     */
    override fun onPostSaveResponse(response: LiveData<Result<Int>>) {
        response.observe(this){result ->
            val code = result.getOrNull()
            if (code == null) {
                FishApplication.context.toast(R.string.cart_send_failure)
            } else {
                FishApplication.context.toast(R.string.cart_send_success)
            }
        }
    }

    /**
     * Refresh data using coroutines
     * Updating the UI in a coroutine on the main thread
     */
    override fun onRefresh() {
        mViewModel.getSaveList()
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