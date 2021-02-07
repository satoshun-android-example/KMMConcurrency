package com.github.satoshun.example.kmmtemplate.shared

actual class Platform actual constructor() {
  actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

fun test() {
  val a = User(id = "", name = "")
}

actual fun Any.freeze() {}
