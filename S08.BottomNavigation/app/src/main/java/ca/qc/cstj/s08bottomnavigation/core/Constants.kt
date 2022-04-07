package ca.qc.cstj.s08bottomnavigation.core

object Constants {

    const val METO_REFRESH_INTERVAL: Long = 120000
    const val API_KEY = "c9fe59e4b2d3e22e3145ab9bb985e36b"
    const val METEO_RETRIEVE_API_URL = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=${API_KEY}&units=metric"
}