package com.example.mvvmkullanim

import androidx.lifecycle.MutableLiveData

class MatematikRepo {

    var matematikselSonuc = MutableLiveData<Number>()
    init {
        matematikselSonuc = MutableLiveData<Number>(0)
    }

    fun matematikselSonucuGetir(): MutableLiveData<Number>{
        return matematikselSonuc
    }
    fun topla(alinanSayi1: String, alinanSayi2: String) {
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()
        val toplam = sayi1 + sayi2
        matematikselSonuc.value = toplam

    }

    fun carp(alinanSayi1: String, alinanSayi2: String) {
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()
        val carpma = sayi1 * sayi2
        matematikselSonuc.value = carpma

    }
}