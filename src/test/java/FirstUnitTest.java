import org.example.UnitClass;

public class FirstUnitTest {
    public static void main(String[] args) {
        UnitClass myClass = new UnitClass();

        // First test -> branches -> true true

        int firstActualResult = myClass.getNumber(-1, -100);
        if (firstActualResult == 48) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        // Second test -> branches -> false false

        int secondActualResult = myClass.getNumber(1, 20);
        if (secondActualResult == 51) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        // Third test -> branches -> true false

        int thirdActualResult = myClass.getNumber(0, 5);
        if (thirdActualResult == 50) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        // Fourth test -> branches -> false true

        int fourthActualResult = myClass.getNumber(0, -5);
        if (fourthActualResult == 50) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
