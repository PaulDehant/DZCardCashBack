package ru.netology;

import org.junit.Assert;
import org.junit.Test;


public class CashBackHackServiceTest {

    @Test
    public void testRemain() {
        CashBackHackService service = new CashBackHackService();
        int amount = 400;
        int expected = 600;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemain2() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemain3() {
        CashBackHackService service = new CashBackHackService();
        int amount = 700;
        int expected = 300;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemain4() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1300;
        int expected = 700;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}