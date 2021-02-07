package com.github.satoshun.example.kmmtemplate.shared

class SampleRepository {
  fun getUser(): User {
    return User(id = "1", name = "tom")
  }

  fun getFreezeUser(): User {
    return User(id = "1", name = "tom").apply { freeze() }
  }

  fun getVarUser(): VarUser {
    return VarUser(id = "1", name = "tom")
  }

  fun getVarUserAndModify(): VarUser {
    return VarUser(id = "1", name = "tom").apply {
      id = "2"
    }
  }

  fun getFreezeVarUser(): VarUser {
    return VarUser(id = "1", name = "tom").apply { freeze() }
  }

  fun getFreezeVarUserAndAfterModify(): VarUser {
    return VarUser(id = "1", name = "tom").apply {
      freeze()
      id = "2"
    }
  }

  fun getFreezeVarUserAndBeforeModify(): VarUser {
    return VarUser(id = "1", name = "tom").apply {
      id = "3"
      freeze()
    }
  }

  fun getNestUser(): NestUser {
    return NestUser(
      user = getUser(),
      varUser = getVarUser()
    ).apply { freeze() }
  }
}

data class User(
  val id: String,
  val name: String
)

data class VarUser(
  var id: String,
  var name: String
)

data class NestUser(
  var user: User,
  var varUser: VarUser
)
