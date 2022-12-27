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

//Herança Com Construtor Parametrizado

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}






//Data Classes (Encapsulamento)

//Enum Classes

//Sealed Classes (Polimorfismo)

//Object keyword