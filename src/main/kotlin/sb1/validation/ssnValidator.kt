package sb1.validation

internal val ssnLength: Validator<String> = Validator(
        validator = { ssn -> ssn.length == 11},
        reason= "Ikke rett lengde"
)

internal val ssnMustBeNumbers: Validator<String> = Validator({ ssn -> ssn.matches("\\d+".toRegex())})

fun ssnValidator(ssn: String) =
    listOf(ssnLength, ssnMustBeNumbers, mod11)
            .map( { it.validate(ssn) })
            .errors()
