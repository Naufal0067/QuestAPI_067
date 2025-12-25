package com.example.localrestapi.uicontroller.route

import com.example.localrestapi.R

object DestinasiEdit : DestinasiNavigasi {
    override val route = "edit_siswa"

    override val titleRes = R.string.edit_siswa

    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}