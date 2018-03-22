package sb1.validation


sealed class ValidatorResult
data class Invalid(val error: String) : ValidatorResult()
class Valid : ValidatorResult()

data class Validator<in R>(val validator: (R) -> Boolean, private val reason: String = "Generisk feil") {
    fun validate(input: R) = when (validator(input)) {
        false -> Invalid(reason)
        true -> Valid()
    }
}

fun List<ValidatorResult>.errors() = this
        .filter { it is Invalid }
        .map { it as Invalid }


fun toAccount(string: String) = string.length == 11



fun cid(string: String): String {
    if(!mod11(string)) {
        return "CID is invalid"
    }
    return ""
}

fun ssn(string: String): String {
    if(string.length != 11) {
        return "SSN has invalid length"
    }

    if(!mod11(string)) {
        return "SSN is invalid"
    }

    return ""
}


private fun mod11(string: String): Boolean {
    val weights = listOf(7, 6, 5, 4, 3, 2, 7, 6, 5, 4, 3, 2, 7, 6, 5, 4, 3, 2, 7, 6, 5, 4, 3, 2, 1)

    var weightIndex = 24
    var sum = 0
    for (i in string.length-1 downTo 0 step 1) {
        sum += weights[weightIndex--] * string.get(index = i).toString().toInt()
    }

    return sum % 11 == 0
}
