package com.example.project1

import android.annotation.SuppressLint
import android.util.Log
import kotlin.text.*

class Mortgage(years: Int, amount: Double, interestRate: Double) {

    private var years: Int = 0
    private var amount: Double = 0.0
    private var interestRate: Double = 0.0


    init {

        setYears(years)
        setAmount(amount)
        setInterestRate(interestRate)

    }

    fun getYears(): Int {
        return years
    }

    fun getAmount(): Double {
        return amount
    }

    fun getInterestRate(): Double {
        return interestRate
    }

    fun setInterestRate(interestRate: Double) {
        this.interestRate = interestRate
    }

    fun setYears(years: Int) {
        this.years = years
    }

    fun setAmount(amount: Double) {
        this.amount = amount
    }

    private fun monthlyPayment(): Double {

        var yearlyPayment = this.amount / this.years
        val yearlyWithInterest = yearlyPayment * this.interestRate
        yearlyPayment += yearlyWithInterest
        val monthlyPayment = yearlyPayment / 12.0
        return monthlyPayment

    }

    private fun yearlyPayments(): Double {
        return monthlyPayment() * 12
    }

    @SuppressLint("DefaultLocale")
    fun formattedOutput(): String{
        return String.format("%.2f", monthlyPayment())
    }

    @SuppressLint("DefaultLocale")
    fun formattedOutputYear(): String{
        return String.format("%.2f", yearlyPayments())
    }

}

