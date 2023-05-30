package adapter.pattern

class Adapter(private val adaptee: Adaptee) : Target {
    override fun request() {
        adaptee.specificRequest()
    }
}