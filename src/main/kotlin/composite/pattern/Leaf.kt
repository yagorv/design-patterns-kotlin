package composite.pattern

class Leaf(private val name: String) : Component {
    override fun operation() {
        println("Operación en hoja $name")
    }
}