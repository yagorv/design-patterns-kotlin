package adapter.pattern

object Client {
    @JvmStatic
    fun main(args: Array<String>) {
        val target: Target //What client expects
        target = Adapter(Adaptee("Adaptee One"))
        target.request()
    }
}