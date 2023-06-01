package builder.examples.customview

class FakeCustomBuilder {

    private var toastTitle: String = ""
    private var toastDescription: String = ""
    private var toastActionImage: String = ""
    private var toastBackgroundColor: Int = 0

    fun title(setter: () -> String) {
        toastTitle = setter()
    }

    fun description(setter: () -> String) {
        toastDescription = setter()
    }

    fun actionImage(setter: () -> String) {
        toastActionImage = setter()
    }

    fun backgroundColor(setter: () -> Int) {
        toastBackgroundColor = setter()
    }

    fun build(): FakeCustomToast {
            return FakeCustomToast.make().also {
                it.setActionImage(toastActionImage)
                it.setTitleText(toastTitle)
                it.setDescriptionText(toastDescription)
                it.setBackgroundColor(toastBackgroundColor)
            }
    }

}