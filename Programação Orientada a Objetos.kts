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

data class User(val name: String, val id: Int) {
    override fun equals (other: Any?) =
        other is User && other.id == this.id
}

fun main() {
    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    //hasCode() function
    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())
    
    println(user.copy())
    println(user === user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 3))
}


//Enum Classes

//Sealed Classes (Polimorfismo)

//Object keyword