package subtask1

import java.time.LocalDate
import java.time.format.DateTimeParseException

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val monthArray = arrayOf(
                "января",
                "февраля",
                "марта",
                "апреля",
                "мая",
                "июня",
                "июля",
                "августа",
                "сентября",
                "октября",
                "ноября",
                "декабря"
            )
            var m = StringBuilder(month)
            if (m.length == 1) {
                m = StringBuilder("0$m")
            }
            val date = LocalDate.parse("$year-$m-$day")
            when (date.dayOfWeek.toString()) {
                "SUNDAY" -> "$day ${monthArray[month.toInt() - 1]}, воскресенье"
                "MONDAY" -> "$day ${monthArray[month.toInt() - 1]}, понедельник"
                "TUESDAY" -> "$day ${monthArray[month.toInt() - 1]}, вторник"
                "WEDNESDAY" -> "$day ${monthArray[month.toInt() - 1]}, среда"
                "THURSDAY" -> "$day ${monthArray[month.toInt() - 1]}, четверг"
                "FRIDAY" -> "$day ${monthArray[month.toInt() - 1]}, пятница"
                "SATURDAY" -> "$day ${monthArray[month.toInt() - 1]}, суббота"
                else -> "Такого дня не существует"
            }
        } catch (e: DateTimeParseException) {
            "Такого дня не существует"
        }
    }
}
