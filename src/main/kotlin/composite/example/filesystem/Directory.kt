package composite.example.filesystem

class Directory(private val name: String) : FileSystemComponent {
    private val components: MutableList<FileSystemComponent> = mutableListOf()

    fun add(component: FileSystemComponent) {
        components.add(component)
    }

    fun remove(component: FileSystemComponent) {
        components.remove(component)
    }

    override fun display(indentation: String) {
        println("$indentation+ $name (directorio)")
        for (component in components) {
            component.display("$indentation   ")
        }
    }
}