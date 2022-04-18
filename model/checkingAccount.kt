package model

import model.Account

class CheckingAccount(
    holder: String,
    accountNumber: Int
) : Account(
    holder = holder,
    accountNumber = accountNumber
) {
    override fun withdraw(value: Double) {
        val valueWithFees = value + 0.1
        if(this.balance >= valueWithFees){
            this.balance -= valueWithFees
        }
    }
}