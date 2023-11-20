package logic

data class Group(
    val name: String,
    val options: List<Option>,
    var isValid: Boolean = false,
    var validationMessage: String = "",
    val min: Int,
    val max: Int,
    val maxUnique: Int
)

data class Option(
    val name: String,
    val quantity: Int = 0
)

fun main() {
    val groups = mutableListOf(
        Group(
            name = "Fruit",
            options = listOf(
                Option(name = "Banana", quantity = 2),
                Option(name = "Mango", quantity = 0),
                Option(name = "Avocado", quantity = 0)
            ),
            min = 2,
            max = 3,
            maxUnique = 2
        ),
        Group(
            name = "Beverages",
            options = listOf(
                Option(name = "Coffee", quantity = 1),
                Option(name = "Tea", quantity = 2),
                Option(name = "Milk")
            ),
            min = 1,
            max = 3,
            maxUnique = 2
        ),
        Group(
            name = "Pizza",
            options = listOf(
                Option(name = "Avocado Extra", quantity = 2),
                Option(name = "Fired Egg", quantity = 0),
                Option(name = "Tomato Extra", quantity = 0)
            ),
            min = 0,
            max = 2,
            maxUnique = 2
        )
    )

    for (group in groups) {
        onSelectValidate(group)
    }

    println("Validation -> ${isValid(groups)}")
}

fun onSelectValidate(group: Group) {
    var totalQty = 0
    for (option in group.options) {
        totalQty += option.quantity
    }

    if (totalQty > group.maxUnique) {
        group.isValid = false
        group.validationMessage = "Max unique"

        println("OnSelect Validation Failed - ${group.name} ->  ${group.validationMessage}")
    }
}

fun isValid(groups: List<Group>): Boolean {
    var isValid = true

    for (group in groups) {
        var selectionCount = 0
        var selectionQty = 0

        for (option in group.options) {
            if (option.quantity > 0) {
                selectionCount++
                selectionQty += option.quantity
            }
        }

        if ((selectionCount >= group.min && selectionCount <= group.max) && selectionQty <= group.maxUnique) {
            group.isValid = true
        } else {
            group.isValid = false
            group.validationMessage = "Min max"

            println("Group Validation - ${group.name} -> ${group.validationMessage}")
        }

        if (isValid) {
            isValid = (selectionCount >= group.min && selectionCount <= group.max) && selectionQty <= group.maxUnique
        }
    }

    return isValid
}