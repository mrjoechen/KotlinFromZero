package com.chenqiao.kotlin.`object`

class User() {

    var name: String? = ""
        get() {
            return field + " append"
        }
        set(value) {
            field + "append"
        }

}