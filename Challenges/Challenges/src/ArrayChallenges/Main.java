package ArrayChallenges;

public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------
        //            Array Challenge #1 - Smallest and Largest
        //--------------------------------------------------------------------

        System.out.println("-----------------------------------------");
        System.out.println("Array Challenge #1 - Smallest and Largest");
        System.out.println("-----------------------------------------\n");

        //-- New Array1 object created
        Array1 array1Test = new Array1();
        int[] minMaxNum = array1Test.minMaxNum(array1Test.getArray());

        //-- Loop through the resulted array and print
        System.out.print("Smallest and largest integers: ");
        for (var elem : minMaxNum) {
            System.out.print(elem + " ");
        }
        System.out.println("\n\n-----------------------------------------\n\n");





        //--------------------------------------------------------------------
        //            Array Challenge #2 - Two Number sum
        //--------------------------------------------------------------------

        System.out.println("-----------------------------------------");
        System.out.println("   Array Challenge #2 - Two Number Sum");
        System.out.println("-----------------------------------------\n");

        //-- Test code goes here
        Array2 array2Test = new Array2();
        int [] twoNumberSum = array2Test.twoNumberSum(array2Test.getArray(), 4);

        System.out.print("Numbers that make up target sum: ");
        for (var elem : twoNumberSum) {
            System.out.print(elem + " ");
        }

        System.out.println("\n\n-----------------------------------------\n\n");

    }
}
