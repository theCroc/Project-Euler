fun main() {
    val squares = mutableListOf<Int>()
    val plain = mutableListOf<Int>()

    for (i in 1..100){
        squares.add(i*i)
        plain.add(i)
    }
    print(plain.sum()*plain.sum() - squares.sum())
}