package com.example.fish.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fish.R
import com.example.fish.databinding.FragmentHomeBinding
import com.example.fish.logic.network.model.Record
import com.example.fish.logic.network.model.TypeData
import com.example.fish.ui.home.adapter.HomeRecyclerAdapter
import com.google.android.material.tabs.TabLayout

class HomeFragment : Fragment(), HomeListener{

    private lateinit var binding: FragmentHomeBinding
    private lateinit var myAdapter: HomeRecyclerAdapter
    private val viewModel: HomeViewModel by lazy{
        ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(HomeViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        binding.viewModel = viewModel
        viewModel.homeListener = this

        initData()
        initView()
        return binding.root
    }

    private fun initData() {
        val temp :MutableList<Record> =
            listOf(
                Record("1", "1","1","sssss", 1, 22, 22, null, 11, 11, 11, 11, 11,"ss", "aa"),
                Record("1", "1","1","sssssuuu", 1, 22, 22, null, 11, 11, 11, 11, 11,"ss", "aa"),
                Record("1", "1","1","sssssuuu", 1, 22, 22, null, 11, 11, 11, 11, 11,"ss", "aa"),
                Record("1", "1","1","sssssuuu", 1, 22, 22, null, 11, 11, 11, 11, 11,"ss", "aa")
            ) as MutableList<Record>


        viewModel.getGoodTypes()
        myAdapter = HomeRecyclerAdapter(temp)
    }

    private fun initView() {
        val temp2 :MutableList<Record> = mutableListOf(
            Record("1", "1","1","iiiiiiiiiii", 1, 22, 22, null, 11, 11, 11, 11, 11,"ss", "aa"),
            Record("1", "1","1","iiiiii", 1, 22, 22, null, 11, 11, 11, 11, 11,"ss", "aa"),
            Record("1", "1","1","siiiiii", 1, 22, 22, null, 11, 11, 11, 11, 11,"ss", "aa"),
            Record("1", "1","1","iiiii", 1, 22, 22, null, 11, 11, 11, 11, 11,"ss", "aa")
        )

        binding.homeRecyclerView.apply{
            layoutManager = LinearLayoutManager(context)
            adapter = myAdapter
        }

        binding.homeTablayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                myAdapter.exchangeData(temp2)
                binding.homeRecyclerView.adapter?.notifyItemRangeChanged(0, temp2.size -1)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
    }

    override fun onGoodTypes(types: LiveData<Result<List<TypeData>>>) {
        types.observe(this){result ->
            val res = result.getOrNull()
            for(type in res!!){
                val tab = binding.homeTablayout.newTab()
                tab.text = type.type
                tab.tag = type.id
                binding.homeTablayout.addTab(tab)
            }
        }
    }

}