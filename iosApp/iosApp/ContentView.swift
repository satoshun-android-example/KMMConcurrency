import SwiftUI
import shared

func greet() -> String {
    let repository = SampleRepository()
    
    let user = repository.getUser()
    print(user)
    
    let freezeUser = repository.getFreezeUser()
    print(freezeUser)
    
    let varUser = repository.getVarUser()
    varUser.id = "test"
    print(varUser)
    
//    let freezeVarUser = repository.getFreezeVarUser()
//    freezeVarUser.id = "test"
//    print(freezeVarUser)
    
    repository.getFreezeVarUserAndBeforeModify()
    
//    repository.getFreezeVarUserAndAfterModify()
    
//    let nestUser =  repository.getNestUser()
//    nestUser.varUser.id = "test"
    
//    GlobalObject().add()
    
//    DispatchQueue.global().async {
//        print(Thread.current.isMainThread)
//        GlobalObjectKt.globalField = 200
//        print(GlobalObjectKt.globalField)
//    }

    print(Thread.current.isMainThread)
    GlobalObjectKt.globalField = 200
    print(GlobalObjectKt.globalField)

    return Greeting().greeting()
}

struct ContentView: View {
    var body: some View {
        Text(greet())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
