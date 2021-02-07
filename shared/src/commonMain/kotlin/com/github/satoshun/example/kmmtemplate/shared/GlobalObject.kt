package com.github.satoshun.example.kmmtemplate.shared

object GlobalObject {
  private var count: Int = 0

  init {
    // ok
    count += 1
  }

  fun add() {
    // ng
    count += 1
  }
}

var globalField = 100
