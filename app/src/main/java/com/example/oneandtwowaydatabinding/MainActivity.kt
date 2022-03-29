package com.example.oneandtwowaydatabinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.oneandtwowaydatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    lateinit var mainViewModel_var: MainViewModelClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main)

        mainViewModel_var = ViewModelProvider(this).get(MainViewModelClass::class.java)


//         Instead of this :
//        binding.updatebtn.setOnClickListener {
//            mainViewModel_var.updateQuotes()
//        }

        // use this bcoz onClick we have used lambda to call updateQuotes() fun
        binding.mainViewModelvariableData= mainViewModel_var


         // binding with live data


//         Instead of this :
//        mainViewModel_var.quoteLiveData.observe(this, Observer {
//            binding.textView.text=it
//        })

        // use this
        binding.lifecycleOwner=this          // one way binding (Updating the views from the data source)

    }

}