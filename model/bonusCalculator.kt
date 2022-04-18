package model

import model.Worker

class BonusCalculator {

    var total: Double = 0.0
        private set

    fun register(worker: Worker){
        this.total += worker.bonus
    }

}