package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class  CashbackHackServiceTest {

    @Test
     public void shouldReturn100IfAmountIs900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);

        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);

        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn500IfAmountIs2000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1500;

        int actual = cashbackHackService.remain(amount);

        int expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn251IfAmountIs2749() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2749;

        int actual = cashbackHackService.remain(amount);

        int expected = 251;
        assertEquals(expected, actual);
    }
}