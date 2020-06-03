fun main() {
    println(primeFactors(600851475143))
}

fun primeFactors(n: Long): List<Long> {
    if (n < 2) return emptyList()

    val primeFactors = mutableListOf<Long>()
    var remainder = n
    var i = 2L
    while (i <= remainder / i) {
        while (remainder % i == 0L) {
            primeFactors.add(i)
            remainder /= i
        }

        i++
    }

    if (remainder > 1)
        primeFactors.add(remainder)

    return primeFactors
}