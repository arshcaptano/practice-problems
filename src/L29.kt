import kotlin.math.abs

fun main() {
    println(divide(-2147483648, -1))
}

fun divide(dividend: Int, divisor: Int): Int {
    val dend: Long = dividend.toLong()
    val dsor: Long= divisor.toLong()

    var isNve = dend < 0.0 || dsor < 0.0
    if (dend < 0.0 && dsor < 0.0) isNve = false

    if (abs(dend) < abs(dsor)) return 0

    var i = 0
    var bal = abs(dend)

    while (bal >= abs(dsor)) {
        bal -= abs(dsor)
        i++
    }

    if (i == -2147483648 && !isNve) i = 2147483647
    return if (isNve) i.unaryMinus() else i
}