package builder.examples.customview

object ClientExample {

    @JvmStatic
    fun main(args: Array<String>) {
        val builder = FakeCustomBuilder().apply {
            title { "Some title" }
            description { "Some description" }
            actionImage { "Some action image" }
            backgroundColor { 645674 }
        }
        builder.build().show()
    }

}