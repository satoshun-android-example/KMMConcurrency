package com.github.satoshun.example.kmmtemplate.androidApp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.kmmtemplate.shared.Greeting
import com.github.satoshun.example.kmmtemplate.shared.SampleRepository

fun greet(): String {
  return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val tv: TextView = findViewById(R.id.text_view)
    tv.text = greet()

    val repository = SampleRepository()
    val user = repository.getUser()
    println(user)

    val freezeUser = repository.getFreezeUser()
    println(freezeUser)

    val varUser = repository.getVarUser()
    varUser.id = "2"
    varUser.name = "1"
    println(varUser)

    val freezeVarUser = repository.getFreezeVarUser()
    freezeVarUser.id = "2"
    freezeVarUser.name = "1"
    println(freezeVarUser)

    repository.getFreezeVarUserAndBeforeModify()
    repository.getFreezeVarUserAndAfterModify()
    repository.getVarUserAndModify()
  }
}
