package composite.example.tasks

class Project(private val name: String) : TaskComponent {
    private val components: MutableList<TaskComponent> = mutableListOf()

    override fun add(component: TaskComponent) {
        components.add(component)
    }

    override fun remove(component: TaskComponent) {
        components.remove(component)
    }

    override fun display(indentation: String) {
        println("$indentation+ $name (Proyecto)")
        for (component in components) {
            component.display("$indentation   ")
        }
    }
}