import jdk.nashorn.internal.objects.NativeString.split

fun main() {
    //1. Put numbers into a string
    var numbers: String = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450"
    //2. Split the string into segments between zeroes. Create list of strings. Since we are looking for a product no sequence can contain a zero.
    var numbersL = numbers.split("0")
    var numbersLong = mutableListOf<String>()
    var numbers13 = mutableListOf<String>()
    var products = mutableListOf<Long>()

    //3. remove all strings shorter than 13
    for (i in 1..numbersL.size-1){
        if (numbersL[i].length >= 13){
            numbersLong.add(numbersL[i])
        }
    }
    //4. For each string cycle through all posible sequences of size 13. Create new list of strings of length 13.
    numbersLong.forEach {
        numbers13.addAll(makeStrings13(it))
    }

    //5. Calculate product of each sequence of numbers. Save in it's own list.
    numbers13.forEach{
        products.add(calculateProduct(it))
    }

    //6. Find biggest product and extract the corresponding sequence
    println(products)
    println(products.max())
    println(numbers13[products.indexOf(products.max())])
}

//This function takes strings of indeterminate lengths and returns all posible
// strings of length 13 without changing character order.

fun makeStrings13(string: String):List<String>{
    var list = mutableListOf<String>()
    var ret: String = ("")

    for (i in 0..string.length-13){
        for (j in 0..12) {
            ret = ret.plus(string[i+j])
        }
        list.add(ret)
        ret = ""
    }
    return list
}

fun calculateProduct(string: String):Long{
    var product: Long = 1
    string.forEach{product *= Character.getNumericValue(it)}
    return product
}