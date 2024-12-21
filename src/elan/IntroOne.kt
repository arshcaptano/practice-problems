package elan

var name = ""
    internal fun kotlinMain() {
        enterAnotherBedroom()
        // enterKitchen()
    }

    fun enterAnotherBedroom() {
        AnotherBedroom().openWindow()
    }


internal class AnotherBedroom {
    companion object {
        const val count: Int = 0
    }
    fun openWindow() {}
}
