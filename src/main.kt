fun main () {
   var toyota = Car("Toyota","Prado","black",5)
    toyota.carry(7)
    toyota.identity()
    toyota.calculateParkingFees(4)
    var new = Bus("Mitsubishi","Aero-Queen","white",34)
    new.maxTripfare(200.0)
    new.calculateParkingFees(10)
}
open class Car (var make:String, var model:String , var colour:String , var capacity:Int) {

    fun carry (people:Int) {

        var x = people - capacity

        if (x>=5 )
        println("Carrying $people passengers")
        else {
            println("Over capacity by $x people")
        }

    }
    fun identity () {
        println("I am a $colour $make $model")
    }
    open fun calculateParkingFees (hours:Int):Int {
       var park = hours*20
        println("The parking fees is $park")
        return park
    }
}
class Bus ( make: String, model: String, colour: String,capacity: Int):Car(make,model,colour, capacity) {
    fun maxTripfare (fare:Double):Double {
        var x = capacity*fare
        println("The maximum amount of fare per trip is $x kshs.")
        return x
    }

    override fun calculateParkingFees(hours: Int): Int {
        //return super.calculateParkingFees(hours)
        var w = capacity*hours
        println(w)
        return w
    }
}