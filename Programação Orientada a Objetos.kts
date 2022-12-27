//Abstração

//Herança

//Herança Simples

open class Dog {
    open fun sayHello(){
        println("Au Au!")
    }
}

class Boxer : Dog() {
    override fun sayHello(){
        println("Ruf Ruf!")
    }
}

fun main() {
    val dog: Dog = Boxer()
    dog.sayHello()
}




//Data Classes (Encapsulamento)

//Enum Classes

//Sealed Classes (Polimorfismo)

//Object keyword