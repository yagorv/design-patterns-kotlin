package builder.examples.customview

class FakeCustomToastView {

    fun setTitleText(label: CharSequence) {
        // add a title in our custom view
        // ex: binding.customViewTitle.setText(resId)
    }

    fun setDescriptionText(text: String) {
        // add a description in our custom view
        // binding.customViewDescription.setText(resId)
    }

    fun setActionImage(drawable: String) {
        // add a image in our custom view
        // binding.customViewImage.setImage(drawable)
    }

    fun setBackgroundColor(color: Int) {
        // add a background color in our custom view
        // binding.customView.setBackgroundColor(color)
    }

    fun show(duration: Int) {
        // simulate show our custom toast
        // binding.customView.show(duration)
    }

}