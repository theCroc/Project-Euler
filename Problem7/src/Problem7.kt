fun main(args: Array<String>) {
    fun make_sieve(src: Sequence<Int>, prime: Int) = src.filter { it % prime != 0 }
    var sieve = sequence {
        var x = 2
        while (true) yield(x++)
    }
    for (i in 1..10001) {
        val prime = sieve.first()
        println("Prime number $i is $prime")
        sieve = make_sieve(sieve, prime)
    }
}