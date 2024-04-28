fun main() {
    //  instantiate a car
    val myMustang = Car(1964, "Ford", gasCapacity = 12.0, mpg = 20.0, speed = 96)

    // Programming Assignment 4
    myMustang.speed = 100
    myMustang.drive(40.0)
    println("odometer: " + myMustang.odometer) // question: odometer: 4400.0 (prints == 240.0)
    println("needOilChange: " + myMustang.needOilChange()) // the same: needOilChange: false
    println("mileageAtOilChange: " + myMustang.mileageAtOilChange) // the same: mileageAtOilChange: 0.0
    myMustang.drive(40.0)
    println("odometer: " + myMustang.odometer) // question: odometer 8400.0 (prints == 240.0)
    println("needOilChange: " + myMustang.needOilChange()) // question: needOilChange: true (prints == false)
    myMustang.changeOil()
    println("needOilChange: " + myMustang.needOilChange()) // the same: needOilChange: false
    println("mileageAtOilChange: " + myMustang.mileageAtOilChange) // question: mileageAtOilChange: 8400.0 (prints == 240.0)

    // In class Exercise
    println(myMustang) // car class doesn't have a toString method: display data type & address location
    println(myMustang.gasLevel)
    myMustang.drive(100.0) // need drive method
    println(myMustang.gasLevel)
    println(myMustang.odometer)
    myMustang.addGas(3.0) // need addGas method
    println(myMustang.gasLevel)
    println(myMustang.year)

    // speed up to the max
    for (i in 0..20) {
        myMustang.accelerate()
        println(myMustang.speed)
    }
    println("Hit the brakes!!!")

    // brake to zero
    for (i in 0..40) {
        myMustang.brake()
        println(myMustang.speed)
    }

    // Programming Assignment 4
    for (i in 0.. 30) {
        // put gas in
        myMustang.addGas(12.0)
        myMustang.drive(200.0)
        println(myMustang.odometer)
        if (myMustang.needOilChange()) {
            myMustang.changeOil()
            println("Oil change: " + myMustang.mileageAtOilChange)
        }
    }
}