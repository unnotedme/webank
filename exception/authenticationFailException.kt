package exception

class AutheticationFailException(
    message: String = "authentication fail"
) : Exception(message)