package composite.example.tasks

interface TaskComponent {
    fun add(component: TaskComponent)
    fun remove(component: TaskComponent)
    fun display(indentation: String = "")
}