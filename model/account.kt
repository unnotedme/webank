package model

class Account(
    var holder: String,
    val accountNumber: Int
) : Authentication {
    var balance = 0.0
        private set
    companion object {
        var total = 0
            private set
    }

    init {
        println("creating account")
        total++
    }

    override fun authentication(password: Int): Boolean {
        return holder.authentication(password)
    }

    fun deposit(value: Double) {
        if (value > 0) {
            this.balance += value
        }
    }

    abstract fun withdraw(value: Double) 

    fun transfer(value: Double, destiny: Account, password: Int): {
        if (balance < value) {
            throw InsufficientBalanceException(
                message = "insufficient balance, current $balance, value to be subtracted $value"
            )
        }
        if (!authentication(password)){
            throw AutheticationFailException()
        }
        balance -= value
        destiny.deposit(value)
        }
    }

    class CheckingAccount (
        holder: Client,
        accountNumber: Int
    ) : Account(
        holder = holder,
        accountNumber = accountNumber
    ) {
        override fun withdraw(value: Double) {
            val valueWithTax = value + 0.1
            if(this.balance >= valueWithTax){
                this.balance -= valueWithTax
            }
        }
    }

    class SavingsAccount (
        holder: Client,
        accountNumber: Int
    ) : Account(
        holder = holder,
        accountNumber = accountNumber
    ) {
        override fun withdraw(value: Double) {
            if(this.balance >= value){
                this.balance -= value
            }
        }
    }
}