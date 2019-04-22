fun main(args: Array<String>) {
    print(reverse("hello world"))
}

fun reverse(s: String) : String {
    var i = 0
    var returnS = ""
    while (i <= s.length) {
        if (i == 0) {
            returnS += (s.substring((s.length - i), (s.length)))
        } else {
            returnS += (s.substring((s.length - i), ((s.length - i) + 1)))
        }
        i += 1

    }
    return returnS
}