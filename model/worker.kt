package model

abstract class Worker(
    val name: String,
    val ssn: String,
    val salary: Double
){
    abstract val bonus: Double


}