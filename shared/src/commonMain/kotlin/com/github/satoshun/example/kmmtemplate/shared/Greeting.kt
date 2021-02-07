package com.github.satoshun.example.kmmtemplate.shared


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
