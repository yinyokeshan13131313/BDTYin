package com.example.bdt

import androidx.lifecycle.LiveData

class BDRepository (private val bdDao: BDDao){

    val alldb : LiveData<List<BD>> = bdDao.getAllBD() //data is come from dao

    suspend fun insertBD(bd: BD){
        bdDao.insertBD(bd)

    }
}