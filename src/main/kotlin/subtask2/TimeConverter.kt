package subtask2

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {
        val hourArray = arrayOf(
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve"
        )
        val minutesArray = arrayOf(
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
            "twenty",
            "twenty one",
            "twenty two",
            "twenty three",
            "twenty four",
            "twenty five",
            "twenty six",
            "twenty seven",
            "twenty eight",
            "twenty nine",
            "thirty"
        )
        return when (minute.toInt()) {
            0 -> "${hourArray[hour.toInt()]} o' clock"
            15 -> "quarter past ${hourArray[hour.toInt()]}"
            30 -> "half past ${hourArray[hour.toInt()]}"
            45 -> "quarter to ${hourArray[hour.toInt() + 1]}"
            1 -> "one minute past ${hourArray[hour.toInt()]}"
            in 1..30 -> "${minutesArray[minute.toInt() - 1]} minutes past ${hourArray[hour.toInt()]}"
            in 31..60 -> "${minutesArray[60 - minute.toInt() - 1]} minutes to ${hourArray[hour.toInt() + 1]}"
            else -> ""
        }
    }
}
