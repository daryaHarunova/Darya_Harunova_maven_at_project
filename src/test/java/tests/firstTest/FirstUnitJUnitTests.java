package tests.firstTest;

import org.example.UnitClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstUnitJUnitTests {

    @Test
    public void firstTest() {
        UnitClass myClass = new UnitClass();

        // First test -> branches -> true true

        int firstActualResult = myClass.getNumber (-1, -100);
        assertEquals(48, firstActualResult);
    }

    @Test
    public void secondTest() {
        UnitClass myClass = new UnitClass();

        // Second test -> branches -> false false

        int result = myClass.getNumber (1, 20);
        assertEquals(51, result);
    }

    @Test
    public void thirdTest() {
        UnitClass myClass = new UnitClass();

        // Third test -> branches -> true false

        int result = myClass.getNumber (0, 5);
        assertEquals(50, result);
    }

    @Test
    public void fourthTest() {
        UnitClass myClass = new UnitClass();

        // Fourth test -> branches -> false true

        int result = myClass.getNumber (0, -5);
        assertEquals(50, result);
    }


}
