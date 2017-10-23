package com.appsbyolympia.olympiabardis.agecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.appsbyolympia.olympiabardis.agecalculator.R.id.etBirth
import com.appsbyolympia.olympiabardis.agecalculator.R.id.tvAge
import kotlinx.android.synthetic.main.activity_main.*
import com.appsbyolympia.olympiabardis.agecalculator.R.id.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvAge.setText("");
    }

    public fun calculateAge(view: View){
        val dob: String = etBirth.text.toString()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val age = currentYear - dob.toInt()
        tvAge.setText("Your age is $age")
    }
}
