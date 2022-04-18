package exception

class InsufficientBalanceException(
    message: String = "insufficient balance"
) : Exception(message)