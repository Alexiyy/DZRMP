fun main() {
    println(getLengthNullSafety("хуй"))
    println(getLengthNullSafety(null))
}

fun getLengthNullSafety(str: String?): Int {
    return str?.length ?: 0
}