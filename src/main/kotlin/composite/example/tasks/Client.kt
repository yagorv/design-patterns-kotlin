package composite.example.tasks

object Client {

    @JvmStatic
    fun main(args: Array<String>) {
        val root = Project("Organización de Tareas")

        val task1 = Task("Tarea 1")
        val task2 = Task("Tarea 2")
        val task3 = Task("Tarea 3")

        val subProject1 = Project("Subproyecto 1")
        val task4 = Task("Tarea 4")
        val task5 = Task("Tarea 5")

        val subProject2 = Project("Subproyecto 2")
        val task6 = Task("Tarea 6")
        val task7 = Task("Tarea 7")

        root.add(task1)
        root.add(task2)
        root.add(task3)
        root.add(subProject1)
        root.add(subProject2)

        subProject1.add(task4)
        subProject1.add(task5)

        subProject2.add(task6)
        subProject2.add(task7)

        root.display()
    }

}