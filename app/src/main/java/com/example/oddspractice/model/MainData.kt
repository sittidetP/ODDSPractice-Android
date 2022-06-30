package com.example.oddspractice.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MainData(
    var text: String
) : Parcelable
