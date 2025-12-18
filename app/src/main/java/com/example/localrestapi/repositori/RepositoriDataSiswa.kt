package com.example.localrestapi.repositori

import com.example.localrestapi.modedata.DataSiswa

interface RepositoriDataSiswa {
    suspend fun getDataSiswa() : List<DataSiswa>

    suspend fun postDataSiswa(dataSiswa: DataSiswa) :retrofit2.Response<Void>
}