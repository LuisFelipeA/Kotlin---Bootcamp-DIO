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


//Herança Passando Argumentos do Construtor para a Superclasse

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India" )

fun main () {
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}



//Data Classes (Encapsulamento)

//Enum Classes

//Sealed Classes (Polimorfismo)

//Object keyword