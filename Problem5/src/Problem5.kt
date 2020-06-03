fun main() {
    var i: Int = 1
    while (!isDivisible(i)){
        i++
    }
    print(i)
}

fun isDivisible(x:Int): Boolean {
    for (i in 1..20){
        if (x % i != 0) {
            return false
        }
    }
    return true
}