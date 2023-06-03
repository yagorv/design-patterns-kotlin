package composite.pattern

object Client {

    @JvmStatic
    fun main(args: Array<String>) {
        val root = Composite("root")

        val leaf1 = Leaf("hoja1")
        val leaf2 = Leaf("hoja2")

        val subComposite = Composite("subComposite")
        val leaf3 = Leaf("hoja3")
        val leaf4 = Leaf("hoja4")

        subComposite.add(leaf3)
        subComposite.add(leaf4)

        root.add(leaf1)
        root.add(leaf2)
        root.add(subComposite)

        root.operation()
    }

}