package com.app.onlineorder.data

data class Hours(
    val friday: Day,
    val monday: Day,
    val saturday: Day,
    val sunday: Day,
    val thursday: Day,
    val tuesday: Day,
    val wednesday: Day
) {
    fun toMap(): Map<String, Day> {
        return mapOf(
            "friday" to friday,
            "monday" to monday,
            "saturday" to saturday,
            "sunday" to sunday,
            "thursday" to thursday,
            "tuesday" to tuesday,
            "wednesday" to wednesday
        )
    }
}