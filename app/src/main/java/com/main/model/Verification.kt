package com.main.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Verification: Serializable {
    @SerializedName("verified")
    @Expose
    private var verified: Boolean? = null

    @SerializedName("reason")
    @Expose
    private var reason: String? = null

    @SerializedName("signature")
    @Expose
    private var signature: Any? = null

    @SerializedName("payload")
    @Expose
    private var payload: Any? = null

    fun getVerified(): Boolean? {
        return verified
    }

    fun setVerified(verified: Boolean?) {
        this.verified = verified
    }

    fun getReason(): String? {
        return reason
    }

    fun setReason(reason: String?) {
        this.reason = reason
    }

    fun getSignature(): Any? {
        return signature
    }

    fun setSignature(signature: Any?) {
        this.signature = signature
    }

    fun getPayload(): Any? {
        return payload
    }

    fun setPayload(payload: Any?) {
        this.payload = payload
    }
}