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
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {
    
    val zoo = Zoo(listOf(Animal("zebra"),Animal("lion")))

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }
}


//Ranges: Loops com Int

fun main () {
    for(i in 0..3) {
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {
        print(i)
    }
    print(" ")

    for(i in 3 downTo 0) {
        print(i)
    }
    print(" ")
    
}


//Ranges: Ifs e loops com Char

fun main() {

    for (c1 in 'a'..'d') {
        print(c1)
    }
    print(" ")

    for (c2 in 'z' downTo 's' step 2) {
        print(c2)
    }
    print(" ")
}


fun main() {

    val x = 2
    if (x in 1..5) {
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {
        print("x is not in range from 6 to 10")
    }
}


// Verificações de Igualdade == e ===

fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)
    println(authors === writers)
}