package adapter.pattern

// What app receives
class Adaptee(private val name: String) {
    fun specificRequest() {
        println("Called specific request on Adaptee $name")
    }
}