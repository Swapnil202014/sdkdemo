package com.app.coforgelib

import android.content.Context
import android.widget.Toast

class SampleToast {
    fun showSimpleToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}