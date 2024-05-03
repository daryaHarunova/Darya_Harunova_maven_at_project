package tests.firstTest;

import org.example.UnitClass;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FirstUnitTestNGTests {

    @Test
    public void firstTest() {
        UnitClass myClass = new UnitClass();

        // First test -> branches -> true true

        int firstActualResult = myClass.getNumber (-1, -100);
        Assert.assertEquals(48, firstActualResult);
    }

    @Test
    public void secondTest() {
        UnitClass myClass = new UnitClass();

        // Second test -> branches -> false false

        int result = myClass.getNumber (1, 20);
        Assert.assertEquals(51, result);
    }

    @Test
    public void thirdTest() {
        UnitClass myClass = new UnitClass();

        // Third test -> branches -> true false

        int result = myClass.getNumber (0, 5);
        Assert.assertEquals(50, result);
    }

    @Test
    public void fourthTest() {
        UnitClass myClass = new UnitClass();

        // Fourth test -> branches -> false true

        int result = myClass.getNumber (0, -5);
        Assert.assertEquals(50, result);
    }


}
