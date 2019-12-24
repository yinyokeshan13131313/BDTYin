package com.example.bdt

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface BDDao {
    @Insert
    suspend fun insertBD(bd: BD)

    @Update
    suspend fun updateBD(bd:BD)

    @Delete
    suspend fun deleteBD(bd: BD)

    @Query("SELECT * FROM birthday")
    fun  getAllBD(): LiveData<List<BD>>

    @Query( "SELECT * FROM birthday WHERE id = :ID") //:ID means parameter
    fun  getABD(ID: Int):BD

}