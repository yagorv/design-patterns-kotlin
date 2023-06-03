package composite.pattern

class Composite(private val name: String) : Component {

    private val children: MutableList<Component> = mutableListOf()

    fun add(component: Component) {
        children.add(component)
    }

    fun remove(component: Component) {
        children.remove(component)
    }

    override fun operation() {
        println("Operación en composite $name")
        for (child in children) {
            child.operation()
        }
    }
}