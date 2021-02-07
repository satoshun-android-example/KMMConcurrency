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
