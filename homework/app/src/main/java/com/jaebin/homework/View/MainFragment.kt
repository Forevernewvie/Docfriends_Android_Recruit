package com.jaebin.homework.View

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.jaebin.homework.R
import com.jaebin.homework.data.Title2
import com.jaebin.homework.data.*
import com.jaebin.homework.databinding.FragmentMainBinding
import com.jaebin.homework.recycler.adapter.*
import com.jaebin.homework.retrofit.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainFragment : Fragment() {
    private lateinit var datas:Datas

    private var mBinding :FragmentMainBinding?=null
    private val binding get() = mBinding!!
    override fun onCreateView(   inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle? ): View? {
        mBinding = FragmentMainBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        context?.let { initRecyclerview(it) }
        initRetrofit()
    }

    override fun onDestroyView() {
        mBinding =null
        super.onDestroyView()
    }



    fun initRecyclerview(context: Context){
        binding.recycler.layoutManager = LinearLayoutManager(context).also { it.orientation=LinearLayoutManager.VERTICAL }
        binding.recycler.setHasFixedSize(true)
        binding.profileView.layoutManager = LinearLayoutManager(context).also { it.orientation=LinearLayoutManager.VERTICAL }
        binding.profileView.setHasFixedSize(true)
    }


    fun initRetrofit(){
        val call = RetrofitClient.service.getDataList()
        call.enqueue(
            object: Callback<Datas> {
                override fun onResponse(call: Call<Datas>, response: Response<Datas>) {
                    if(response.isSuccessful){
                        datas = response.body()!!
                        val list :List<Title> = arrayListOf(Title("활동이 많은 전문가",R.drawable.ic_viewlist,datas.expertList,))
                        val list2 :List<Title2> = arrayListOf(Title2("근처 의료기관",R.drawable.ic_viewlist,datas.companyList))
                        binding.recycler.adapter = multiAdapter(datas,datas.pageMap,list,list2)
                        binding.profileView.adapter = ProfileItemAdapter(Profile("박준걸1님이 궁금한 증상을 알려주세요"))
                    }
                }

                override fun onFailure(call: Call<Datas>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            }
        )



    }




}