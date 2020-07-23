package ferra.solution.mykotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import ferra.solution.mykotlin.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding;

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.button.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        if (v!!.id == binding.button.id){
            val yearOfBirth: Int = binding.edEnterYearOfBirth.text.toString().toInt()
            val currentYear: Int = Calendar.getInstance().get(Calendar.YEAR)
            val age = currentYear - yearOfBirth
            binding.tvAgeDisplay.text = "Your age is $age years"
        }
    }
}