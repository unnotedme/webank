package model

import model.Account

class SavingsAccount(
    holder: String,
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