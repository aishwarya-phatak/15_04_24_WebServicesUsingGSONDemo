package com.bitcode.a15_04_24_webservicesusinggsondemo

import android.util.Log
import com.google.gson.Gson
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class WebUtil {
    companion object{
        fun getUsers(pageNumber : Int) : APIResponse{
            var getUsersAPIUrl = URL("https://reqres.in/api/users?page=$pageNumber")
            var httpURLConnection = getUsersAPIUrl.openConnection() as HttpURLConnection

            httpURLConnection.requestMethod = "GET"
            httpURLConnection.connect()

            var resReader = InputStreamReader(httpURLConnection.inputStream)
            var gson = Gson()
            var apiResponse = gson.fromJson<APIResponse>(
                resReader,
                APIResponse::class.java
            )

            Log.e("tag","${apiResponse.toString()}")
            for (eachUser in apiResponse.usersArray){
                Log.e("eachUser Object", "${eachUser.toString()}")
            }
            return  apiResponse
        }
    }
}