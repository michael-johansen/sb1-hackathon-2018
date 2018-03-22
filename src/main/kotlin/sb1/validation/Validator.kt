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

