package logic

import junit.framework.Assert
import org.junit.Test

class MultipleViewTypeTest {
    @Test
    fun isValidSuccess() {
        Assert.assertEquals(
            true, isValid(
                mutableListOf(
                    Group(
                        name = "Pizza",
                        options = listOf(
                            Option(name = "Avocado Extra", quantity = 2),
                            Option(name = "Fired Egg", quantity = 0),
                            Option(name = "Tomato Extra", quantity = 0)
                        ),
                        min = 0,
                        max = 3,
                        maxUnique = 3
                    )
                )
            )
        )
    }

    @Test
    fun isValidFail() {
        Assert.assertEquals(
            false, isValid(
                mutableListOf(
                    Group(
                        name = "Fruit",
                        options = listOf(
                            Option(name = "Banana", quantity = 1),
                            Option(name = "Mango"),
                            Option(name = "Avocado")
                        ),
                        min = 2,
                        max = 3,
                        maxUnique = 1
                    )
                )
            )
        )
    }

    @Test
    fun isValidFail2() {
        Assert.assertEquals(
            false, isValid(
                mutableListOf(
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
                    )
                )
            )
        )
    }

    @Test
    fun isValidSuccess2() {
        Assert.assertEquals(
            true, isValid(
                mutableListOf(
                    Group(
                        name = "Beverages",
                        options = listOf(
                            Option(name = "Coffee",quantity = 1),
                            Option(name = "Tea", quantity = 1),
                            Option(name = "Milk")
                        ),
                        min = 1,
                        max = 3,
                        maxUnique = 2
                    )
                )
            )
        )
    }

    @Test
    fun isValidFail3() {
        Assert.assertEquals(
            false, isValid(
                mutableListOf(
                    Group(
                        name = "Beverages",
                        options = listOf(
                            Option(name = "Coffee"),
                            Option(name = "Tea"),
                            Option(name = "Milk")
                        ),
                        min = 1,
                        max = 3,
                        maxUnique = 2
                    )
                )
            )
        )
    }
}