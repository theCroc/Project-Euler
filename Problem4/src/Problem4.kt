fun main() {
    var largest: Int = 0

    for (i in 100..999){
        for (j in 100..999) {
            if (isPalindrome(i*j,0) && (i*j > largest)) {
                largest = i*j
            }
        }
    }

    print(largest)
}

fun isPalindrome(n: Int, i: Int):Boolean {
    val nS = n.toString()
    var j = i
    if (j > nS.length.toInt() / 2) {
        return true
    } else if (nS[j] == nS[nS.length.toInt() - 1 - j]) {
        return isPalindrome(n, j+1)
    } else {
        return false
    }
}