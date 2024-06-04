package com.example.project1

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.util.Log



class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mortgage = Mortgage(30, 300000.0, 0.065)

        println("Mortgage Details: ")
        println("Monthly Payments: $${mortgage.formattedOutput()}")
        println("Yearly Payments: $${mortgage.formattedOutputYear()}")

        Log.d("MainActivity", "Mortgage Details: ")
        Log.d("MainActivity", "Monthly Payments: $${mortgage.formattedOutput()}")
        Log.d("MainActivity", "Yearly Payments: $${mortgage.formattedOutputYear()}")

        mortgage.setYears(15)
        mortgage.setAmount(100000.00)
        mortgage.setInterestRate(0.07)

        println("Updated Mortgage Details: ")
        println("Monthly Payments: $${mortgage.formattedOutput()}")
        println("Yearly Payments: $${mortgage.formattedOutputYear()}")

        Log.d("MainActivity", "Updated Mortgage Details: ")
        Log.d("MainActivity", "Monthly Payments: $${mortgage.formattedOutput()}")
        Log.d("MainActivity", "Yearly Payments: $${mortgage.formattedOutputYear()}")

    }

}
