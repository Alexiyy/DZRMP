fun main() {
    println(getLengthNullDangerous("хуй"))
    println(getLengthNullDangerous(null))
}

fun getLengthNullDangerous(str: String?): Int? {
    return str?.length
}