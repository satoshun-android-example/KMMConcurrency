package com.github.satoshun.example.kmmtemplate.shared

import platform.UIKit.UIDevice
import kotlin.native.concurrent.freeze as iosFreeze

actual class Platform actual constructor() {
  actual val platform: String =
    UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun Any.freeze() {
  this.iosFreeze()
}
