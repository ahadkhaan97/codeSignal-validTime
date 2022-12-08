fun main() {
    solution("13:58")
}

fun solution(time: String): Boolean {
    val timeArray = time.split(":")
    if (timeArray.size != 2)
        return false

    if (timeArray[0].toInt() > -1 && timeArray[0].toInt() < 25) {
        if (timeArray[1].toInt() > -1 && timeArray[1].toInt() < 60) {
            if ((timeArray[0].toInt() * 60 + timeArray[1].toInt()) < 1440) {
                return true
            }
        }
    }

    return false
}
