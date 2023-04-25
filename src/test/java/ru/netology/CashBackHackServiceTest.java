package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashBackHackServiceTest {
    CashBackHackService service = new CashBackHackService();

    @Test
    public void testRemain() {
        int amount = 800;
        int expected = 200;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testRemain2() {
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemain3() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
}