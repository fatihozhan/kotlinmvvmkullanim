package com.example.mvvmkullanim

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SayfaViewModel : ViewModel() {
    var sonuc = MutableLiveData<Number>()
    var mrepo = MatematikRepo()
    init {
        sonuc = mrepo.matematikselSonucuGetir()
    }


    fun toplamaYap(alinanSayi1: String, alinanSayi2: String) {
      mrepo.topla(alinanSayi1, alinanSayi2)

    }

    fun carpmaYap(alinanSayi1: String, alinanSayi2: String) {
       mrepo.carp(alinanSayi1, alinanSayi2)

    }
}