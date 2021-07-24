import kotlin.random.Random

fun generatePassword(length: Int): String {
    var randomPassword = ""
    for (i in 1..length) {
        randomPassword += Random.nextInt(33, 127).toChar()
    }
    return randomPassword
}

// i.e to generate a 20 length random password from code 33 to 127
println(generatePassword(20))
