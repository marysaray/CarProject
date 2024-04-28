// add a constructor by adding () after class Car
class Car( val year: Int, val make : String, val gasCapacity : Double,
val mpg : Double, var speed : Int) {
    // fields
    var odometer : Double
    var gasLevel : Double
    var mileageAtOilChange : Double

    // init block set values
    init { // brand-new car
        // set odometer
        odometer = 0.0
        // set gasLevel
        gasLevel = gasCapacity
        // set gasLevel
        mileageAtOilChange = 0.0
    }

    // add toString method by using override
    override fun toString() : String {
        // return make, year, speed
        return make + ":" + year + ":" + speed
    }
}