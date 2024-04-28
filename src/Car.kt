import kotlin.math.max
import kotlin.math.min

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
        // set gasLevel == fill gas tank
        gasLevel = gasCapacity
        // set gasLevel
        mileageAtOilChange = 0.0
    }

    // add accelerate method
    fun accelerate() {
        // speed add +5 but not greater than 180
        speed = min(speed + 5, 180)
    }

    // add brake method
    fun brake() {
        speed = max(speed - 5, 0)
    }

    // add toString method by using override
    override fun toString() : String {
        // return make, year, speed
        return make + ":" + year + ":" + speed
    }
    // add drive method
    fun drive(hours : Double) {
        // add a variable
        val distance : Double = hours * speed
        val fuelConsumed: Double = hours * speed / mpg
        // not enough gas to drive anymore
        if (fuelConsumed > gasLevel) {
            // add to odometer as far as we can go
            odometer += gasLevel * mpg // total gas = gallons is number of gallons convert to distance: miles = gallon * mpg
            gasLevel = 0.0
        }
        else {
            // drive a certain amount of hours * speed (certain distance)
            odometer += distance
            // lose gas: time driven, speed driven, mpg
            gasLevel -= fuelConsumed
        }
    }
    // add gas method
    fun addGas(gallons: Double) {
        gasLevel += min(gasCapacity, gasLevel + gallons)
    }

    // how often to do an oil change depends on the odometer
    fun needOilChange() : Boolean {
        // 5,000 since oilChange
        return (odometer - mileageAtOilChange > 5000)
    }

    // change the oil
    fun changeOil() {
        mileageAtOilChange = odometer
    }
}