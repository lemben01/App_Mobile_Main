package ca.qc.cstj.s08bottomnavigation.domain.models

data class Meteo (
    val city: String,
    val country: String,
    val temperature: Double,
    val weather: String,
    val timestamp : Int,
    val timezone: Int,
    val latitude : Double,
    val longitude: Double
)




