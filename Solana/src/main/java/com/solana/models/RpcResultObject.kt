package com.solana.models

import com.squareup.moshi.Json

open class RpcResultObject(@Json(name = "context") var context: Context? = null) {
    class Context {
        @Json(name = "slot")
        private val slot: Long = 0
    }
}