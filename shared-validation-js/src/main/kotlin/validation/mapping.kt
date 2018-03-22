package sb1.validation

@JsName("toAccount")
fun toAccountJs(string: String) = sb1.validation.toAccount(string)

@JsName("accountValidator")
fun accountValidatorJs(account: String) = sb1.validation.accountValidator(account)
