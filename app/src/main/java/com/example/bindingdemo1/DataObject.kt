package com.example.bindingdemo1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.bindingdemo1.databinding.ActivityDataObjectBinding

class DataObject : AppCompatActivity() {
    private lateinit var binding: ActivityDataObjectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_object)
        binding.student = getStudent()
    }

    fun getStudent():Student{
        return Student(1,"Swapna","swapna1569@gmail.com")
    }
}