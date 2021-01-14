package ru.netology.service;

import org.testng.annotations.Test;

import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

class CashbackHackServiceTest {

    @Test
    void shouldReturn100IfAmountIs900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);

        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);

        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void shouldReturn500IfAmountIs2000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1500;

        int actual = cashbackHackService.remain(amount);

        int expected = 500;
        assertEquals(actual, expected);
    }

    @Test
    void shouldReturn251IfAmountIs2749() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2749;

        int actual = cashbackHackService.remain(amount);

        int expected = 251;
        assertEquals(actual, expected);
    }
}