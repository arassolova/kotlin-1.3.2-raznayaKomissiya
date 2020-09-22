fun main() {
    val cardType = "Vk Pay"
    val transfersSum = 0
    val moneyAmount = 1_000

    val commission = calculateCommission(cardType, moneyAmount, transfersSum)
    println("Commission: $commission kopecks")

    val commission2 = calculateCommission("Visa", 10_000, 0)
    println("Commission: $commission2 kopecks")

    val commission3 = calculateCommission("Maestro", 3_000, 80_000)
    println("Commission: $commission3 kopecks")

    val commission4 = calculateCommission("Мир", 3_000)
    println("Commission: $commission4 kopecks")
}

private fun calculateCommission(
    cardType: String = "VK Pay",
    moneyAmount: Int,
    transfersSum: Int = 0
): Int {
    val moneyAmountKopecks = moneyAmount * 100
    val commissionKopecks = when (cardType) {
        "Visa", "Мир" -> if (moneyAmountKopecks * 0.0075 < 35 * 100) {
            35 * 100
        } else {
            (moneyAmountKopecks * 0.0075).toInt()
        }
        "Mastercard", "Maestro" -> if (transfersSum < 75_000) {
            0
        } else {
            (moneyAmountKopecks * 0.006 + 20 * 100).toInt()
        }
        else -> 0
    }
    return commissionKopecks
}