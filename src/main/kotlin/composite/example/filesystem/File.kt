package composite.example.filesystem

class File(private val name: String) : FileSystemComponent {
    override fun display(indentation: String) {
        println("$indentation- $name (archivo)")
    }
}