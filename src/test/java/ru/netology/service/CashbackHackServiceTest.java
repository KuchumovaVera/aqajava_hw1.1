package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldTestRemainLess1000(){
        CashbackHackService cashbackHackService= new CashbackHackService();
        int amount = 800;
        int actual = cashbackHackService.remain(amount);
        int expected = 200;

        assertEquals(actual,expected);
    }
    @Test
    public void shouldTestRemain1000(){
        CashbackHackService cashbackHackService= new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);
    }
    @Test
    public void shouldTestRemainMore1000(){
        CashbackHackService cashbackHackService= new CashbackHackService();
        int amount = 1100;
        int actual = cashbackHackService.remain(amount);
        int expected = 900;

        assertEquals(actual,expected);
    }
}
