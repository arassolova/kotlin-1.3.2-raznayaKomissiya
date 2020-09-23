package ru.netology
import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculateCommission_VKPay() {
        val cardType = "Vk Pay"
        val transfersSum = 0
        val moneyAmount = 1_000

        val result = calculateCommission(
            cardType = cardType,
            moneyAmount = moneyAmount,
            transfersSum = transfersSum
        )
        assertEquals(result, 0)
    }

    @Test
    fun calculateCommission_VisaLess35() {
        val cardType = "Visa"
        val transfersSum = 0
        val moneyAmount = 3_000

        val result = calculateCommission(
            cardType = cardType,
            moneyAmount = moneyAmount,
            transfersSum = transfersSum
        )
        assertEquals(result, 3500)
    }

    @Test
    fun calculateCommission_VisaMore35() {
        val cardType = "Visa"
        val transfersSum = 0
        val moneyAmount = 10_000

        val result = calculateCommission(
            cardType = cardType,
            moneyAmount = moneyAmount,
            transfersSum = transfersSum
        )
        assertEquals(result, 7500)
    }

    @Test
    fun calculateCommission_MirLess35() {
        val cardType = "Мир"
        val transfersSum = 0
        val moneyAmount = 3_000

        val result = calculateCommission(
            cardType = cardType,
            moneyAmount = moneyAmount,
            transfersSum = transfersSum
        )
        assertEquals(result, 3500)
    }

    @Test
    fun calculateCommission_MirMore35() {
        val cardType = "Мир"
        val transfersSum = 0
        val moneyAmount = 10_000

        val result = calculateCommission(
            cardType = cardType,
            moneyAmount = moneyAmount,
            transfersSum = transfersSum
        )
        assertEquals(result, 7500)
    }

    @Test
    fun calculateCommission_MastercardLess75000() {
        val cardType = "Mastercard"
        val transfersSum = 0
        val moneyAmount = 10_000

        val result = calculateCommission(
            cardType = cardType,
            moneyAmount = moneyAmount,
            transfersSum = transfersSum
        )
        assertEquals(result, 0)
    }

    @Test
    fun calculateCommission_MastercardMore75000() {
        val cardType = "Mastercard"
        val transfersSum = 80_000
        val moneyAmount = 10_000

        val result = calculateCommission(
            cardType = cardType,
            moneyAmount = moneyAmount,
            transfersSum = transfersSum
        )
        assertEquals(result, 8000)
    }

    @Test
    fun calculateCommission_MaestroLess75000() {
        val cardType = "Maestro"
        val transfersSum = 0
        val moneyAmount = 10_000

        val result = calculateCommission(
            cardType = cardType,
            moneyAmount = moneyAmount,
            transfersSum = transfersSum
        )
        assertEquals(result, 0)
    }

    @Test
    fun calculateCommission_MaestroMore75000() {
        val cardType = "Maestro"
        val transfersSum = 80_000
        val moneyAmount = 10_000

        val result = calculateCommission(
            cardType = cardType,
            moneyAmount = moneyAmount,
            transfersSum = transfersSum
        )
        assertEquals(result, 8000)
    }

    @Test
    fun calculateCommission_default() {
        val moneyAmount = 10_000

        val result = calculateCommission(moneyAmount = moneyAmount)
        assertEquals(result, 0)
    }
}