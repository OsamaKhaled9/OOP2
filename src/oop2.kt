import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`)
    println("Enter bmw car model and speed")
    val bm = BMW(scan.next(), scan.next(), scan.nextFloat())
    scan.nextLine()
    println("Fuel type is ${bm.getFuelType()}")
    println("Enter Tesla Car model color and speed ")
    val ts = Tesla(scan.next(), scan.next(), scan.nextFloat())
    scan.nextLine()
    println("Fuel Type is ${ts.getFuelType()}")
}

abstract class Car(model:String,color:String,speed:Float) {
    abstract fun getFuelType(): String
}
class BMW (model:String,color:String,speed:Float):Car(model,color,speed) {
    override fun getFuelType(): String {

        return "gas"
    }
}

class Tesla (model:String,color:String,speed:Float):Car(model,color,speed) {
    override fun getFuelType(): String {

        return "electricity"
    }
}