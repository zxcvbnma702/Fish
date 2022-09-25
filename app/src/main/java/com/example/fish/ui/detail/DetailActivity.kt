package com.example.fish.ui.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import com.example.fish.R
import com.example.fish.databinding.ActivityDetailBinding
import com.example.fish.logic.network.model.DetailsData

class DetailActivity : AppCompatActivity(), DetailsListener {

    private lateinit var binding: ActivityDetailBinding
    private val viewModel by lazy {
        ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(DetailViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
        binding.viewModel = viewModel

        viewModel.detailsListener = this

        val id = intent.getStringExtra("id")
        if (id == null) viewModel.goodsId = "0" else viewModel.goodsId = id

        initView()
        setContentView(binding.root)
    }

    private fun initView() {

    }

    override fun onResponse(response: LiveData<Result<DetailsData>>) {

    }

    companion object {
        fun startActivity(context: Context, id: String) {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("id", id)
            context.startActivity(intent)
        }
    }
}