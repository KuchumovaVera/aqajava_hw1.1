package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldTestRemainLess1000(){
        CashbackHackService cashbackHackService= new CashbackHackService();
        int amount = 800;
        int actual = cashbackHackService.remain(amount);
        int expected = 200;

        assertEquals(expected,actual);
    }
    @Test
    public void shouldTestRemain2000(){
        CashbackHackService cashbackHackService= new CashbackHackService();
        int amount = 2000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected,actual);
    }
    @Test
    public void shouldTestRemainMore1000(){
        CashbackHackService cashbackHackService= new CashbackHackService();
        int amount = 1100;
        int actual = cashbackHackService.remain(amount);
        int expected = 900;

        assertEquals(expected,actual);
    }
}
