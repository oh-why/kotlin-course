package lessons.lesson05.homework

fun main() {
    // 1
    val initialSoundLevel: Int = 0
    val coefficient: Double? = null
    val result1 = initialSoundLevel * (coefficient ?: 0.5)

    // 2
    val insurancePercent: Double = 0.5
    val price: Double? = null
    // price * 1.005
    val result2 = (price ?: 50.0) * (1 + insurancePercent / 100)

    // 3
    val pressure: String? = null
    val msg: String = "no data"
    val result3 = pressure ?: msg
}