package com.bitcode.fragments3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var formFragment : FormFragment
    private lateinit var dataFragment: DataFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFragments()
    }

    private fun initFragments() {
        formFragment = supportFragmentManager.findFragmentById(R.id.formFragment) as FormFragment
        dataFragment = supportFragmentManager.findFragmentById(R.id.dataFragment) as DataFragment
    }

    //way 1
    fun sendDataToDataFragment(data : String) {
        dataFragment.data = data
    }

    //way1
    fun sendDataToFormFragment(data : String) {
        formFragment.updatedData = data
    }

}