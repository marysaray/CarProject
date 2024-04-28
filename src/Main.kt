fun main() {
    //  instantiate a car
    val myMustang = Car(1964, "Ford", gasCapacity = 12.0, mpg = 20.0, speed = 96)

    println(myMustang) // car class doesn't have a toString method: display data type & address location
    println(myMustang.gasLevel)
    // myMustang.drive(100) // need drive method
    println(myMustang.gasLevel)
    println(myMustang.odometer)
    // myMustang.addGas(3) // need addGas method
    println(myMustang.gasLevel)
    println(myMustang.year)
}