package sb1.validation

fun cidValidator(ssn: String) =
        listOf(mod11)
                .map( { it.validate(ssn) })
                .errors()
