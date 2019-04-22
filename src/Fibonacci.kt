import java.util.ArrayList

fun main(args: Array<String>) {
    fib(12)

}


// 0,1,1,2,3,5,8,13
// 1,2,3,4,5,6,7,4
fun fib(no : Int) : List<Int> {
    if (no == 0) {
        return ArrayList()
    }

    var a = 0
    var b = 1

    val numbers = ArrayList<Int>(no)

    if (no == 1) {
        numbers.add(a)
        print(a)
    } else if (no == 2) {
        numbers.add(a)
        numbers.add(b)
        print("$a, $b")
    } else if (no > 1) {
        numbers.add(a)
        numbers.add(b)
        print("$a, $b, ")
        var i = 2
        while (i < no) {
            val c = a + b
            numbers.add(c)
            print("$c, ")
            a = b
            b = c
            i += 1
        }
    }
    return numbers

}

