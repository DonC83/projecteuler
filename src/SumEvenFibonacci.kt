fun main(args: Array<String>) {
    print(evenFibs())
}

//1,2,3,5,8,13,21,34,55,89
//1,2,3,4,5,6 ,7 ,8 ,9 ,10
fun evenFibs(): Int {
    var a = 1
    var b = 2
    var c = 0

    val limit = 4000000

    var sum = 2
    while (c < limit) {
        c = a + b
        println(c)
        if ((c % 2) == 0 && c < limit) {
            sum += c
        }
        a = b
        b = c
    }
    return sum
}