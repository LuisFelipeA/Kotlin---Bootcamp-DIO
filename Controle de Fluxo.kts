//When Statement

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {
    when (obj){
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknow")
    }
}

class MyClass


//When Expression

fun main() {
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class MyClass


//Loops:For

fun main() {

    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, its a $cake cake")
    }
}


//Loops: While e do while

fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun main(args: Array<String>) {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten ++
    }

    do {
        bakeACake()
        cakesBaked ++
    } while (cakesBaked < cakesEaten)
}


//Loops:Iterators

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {
    operator fun interator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {
    
    val zoo = Zoo(listOf(Animal("zebra"),Animal("lion")))

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }
}
