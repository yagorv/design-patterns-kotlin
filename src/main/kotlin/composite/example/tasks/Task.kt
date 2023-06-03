package composite.example.tasks

class Task(private val name: String) : TaskComponent {
    override fun add(component: TaskComponent) {
        // No se aplica para tareas individuales
    }

    override fun remove(component: TaskComponent) {
        // No se aplica para tareas individuales
    }

    override fun display(indentation: String) {
        println("$indentation- $name")
    }
}