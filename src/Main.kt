fun main() {
    val myMustang = Car(1964, "Ford", gasCapacity = 12.0, mpg = 20.0, speed = 96)

    println(myMustang)
    println(myMustang.gasLevel)
    myMustang.drive(100)
    println(myMustang.gasLevel)
    println(myMustang.odometer)
    // myMustang.addGas(3)
    println(myMustang.gasLevel)
    println(myMustang.year)
}