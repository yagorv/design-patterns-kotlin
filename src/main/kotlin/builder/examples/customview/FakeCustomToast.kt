package builder.examples.customview

class FakeCustomToast(binding: FakeBinding) {

    private val fakeCustomToastView: FakeCustomToastView = binding.root

    fun setTitleText(text: String) {
        fakeCustomToastView.setTitleText(text)
    }

    fun setDescriptionText(text: String) {
        fakeCustomToastView.setDescriptionText(text)
    }

    fun setActionImage(text: String) {
        fakeCustomToastView.setActionImage(text)
    }

    fun setBackgroundColor(res: Int) {
        fakeCustomToastView.setBackgroundColor(res)
    }

    fun show() {
        print("Showing my custom View")
        fakeCustomToastView.show(1000)
    }

    companion object {
        fun make(): FakeCustomToast {
            val binding = FakeBinding().inflate()
            return FakeCustomToast(binding)
        }
    }

}

class FakeBinding(val root: FakeCustomToastView = FakeCustomToastView()) {
    fun inflate(): FakeBinding = FakeBinding()
}