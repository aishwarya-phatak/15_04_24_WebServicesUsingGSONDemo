package com.bitcode.a15_04_24_webservicesusinggsondemo

import android.os.AsyncTask

class WebThread : AsyncTask<Any, Any, APIResponse?>() {
    override fun doInBackground(vararg p0: Any?): APIResponse? {
        return WebUtil.getUsers(1)
    }

    override fun onPostExecute(result: APIResponse?) {
        super.onPostExecute(result)
    }
}