package com.deleco.app.model

data class Weather(
    val cod: String, // 200
    val message: Int, // 0
    val cnt: Int, // 40
    val list: List<clima>,
    val city: City
) {
    data class clima(
        val dt: Int, // 1590278400
        val main: Main,
        val weather: List<Weather>,
        val clouds: Clouds,
        val wind: Wind,
        val rain: Rain,
        val sys: Sys,
        val dt_txt: String // 2020-05-24 00:00:00
    ) {
        data class Main(
            val temp: Double, // 297.52
            val feels_like: Double, // 300.33
            val temp_min: Double, // 295.81
            val temp_max: Double, // 297.52
            val pressure: Int, // 1014
            val sea_level: Int, // 1013
            val grnd_level: Int, // 916
            val humidity: Int, // 74
            val temp_kf: Double // 1.71
        )

        data class Weather(
            val id: Int, // 500
            val main: String, // Rain
            val description: String, // light rain
            val icon: String // 10n
        )

        data class Clouds(
            val all: Int // 42
        )

        data class Wind(
            val speed: Double, // 0.89
            val deg: Int // 101
        )

        data class Rain(
            val `3h`: Double // 0.91
        )

        data class Sys(
            val pod: String // n
        )
    }

    data class City(
        val id: Int, // 3682385
        val name: String, // Floridablanca
        val coord: Coord,
        val country: String, // CO
        val population: Int, // 252267
        val timezone: Int, // -18000
        val sunrise: Int, // 1590230099
        val sunset: Int // 1590275017
    ) {
        data class Coord(
            val lat: Double, // 7.0622
            val lon: Double // -73.0864
        )
    }
}