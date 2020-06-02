fun main() {
    val list = createList(3,5,999)
    printListInfo(list)
}

fun printListInfo(list:List<Int>){
    println("${list.sum()} With ${list.size} elements")
}

fun createList(x: Int, y:Int, max:Int): List<Int> {
    val list = mutableListOf<Int>()
    for (i in 1..max){
        if (i.rem(x) == 0 || i.rem(y) == 0)
        list.add(i)
    }

    return list
}
