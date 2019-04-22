fun main(args: Array<String>) {
    println(" = ${findMultilpes(10)}")
}

fun findMultilpes(n: Int) : Int{
    var i = 0
    var count = 0
    while (i < n) {
        if ((i % 3) == 0 || (i % 5) == 0) {
            count += i
            print("$i ,")
        }
        i++
    }

    return count
}