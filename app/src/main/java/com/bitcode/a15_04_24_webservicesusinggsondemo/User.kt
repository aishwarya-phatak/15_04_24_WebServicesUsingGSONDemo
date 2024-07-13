package com.bitcode.a15_04_24_webservicesusinggsondemo

import com.google.gson.annotations.SerializedName

data class User(
    var id : Int,
    @SerializedName("first_name")
    var firstName : String,
    @SerializedName("last_name")
    var lastName : String,
    var email : String,
    var avatar : String
)