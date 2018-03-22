package sb1.validation

internal val accountCannotStartWithZero: Validator<String> = Validator(
        validator = { account -> account.firstOrNull() != '0' },
        reason = "Kan ikke starte med 0")

internal val accountLength: Validator<String> = Validator(
        validator = { a -> a.length == 11 },
        reason = "Ikke rett lengde")

internal val accountMustBeNumbers: Validator<String> = Validator({ account -> account.matches("\\d+".toRegex()) })


fun accountValidator(account: String) =
        listOf(accountCannotStartWithZero, accountLength, accountMustBeNumbers)
                .map { it.validate(account) }
                .errors()
