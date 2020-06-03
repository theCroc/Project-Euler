fun main() {
    val list = mutableListOf<Int>(1,2)
    println(findEven(nextElement(list)).sum())
}

fun nextElement(list:List<Int>):List<Int>{
    var list2 = mutableListOf<Int>()
    list2.addAll(list)

    if (list2.last() + list2.elementAt(list2.indexOf(list2.last())-1) < 4000000){
        list2.add(list2.last() + list2.elementAt(list2.indexOf(list2.last())-1))

        return nextElement(list2)
    } else {
        return list2
    }
}

fun findEven(list:List<Int>):List<Int>{
    val ret = list.filter{it % 2 == 0}
    return ret
}