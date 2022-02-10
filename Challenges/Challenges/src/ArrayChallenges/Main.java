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





        //--------------------------------------------------------------------
        //            Array Challenge #3 - Three Number sum
        //--------------------------------------------------------------------

        System.out.println("-----------------------------------------");
        System.out.println("  Array Challenge #3 - Three Number Sum");
        System.out.println("-----------------------------------------\n");
        Array3 array3Test = new Array3();
        //-- Changing the target sum here will alter the results. Don't forget to update the sout on line 62.
        int[][] threeNumberSum = array3Test.threeNumberSum(array3Test.getArray(), 10);

        System.out.print("Numbers that make up target sum of " + 10 + ": ");
        for (int i = 0; i < threeNumberSum.length; i++) {
            System.out.println("");
            for (int j = 0; j < threeNumberSum[i].length; j++) {
                System.out.print(threeNumberSum[i][j] + ", ");
            }
        }

        System.out.println("\n\n-----------------------------------------\n\n");





        //--------------------------------------------------------------------
        //            Array Challenge #4 - Four Number sum
        //--------------------------------------------------------------------

        System.out.println("-----------------------------------------");
        System.out.println("  Array Challenge #4 - Four Number Sum");
        System.out.println("-----------------------------------------\n");
        Array4 array4Test = new Array4();
        //-- Changing the target sum here will alter the results. Don't forget to update the sout on line 62.
        int[][] fourNumberSum = array4Test.fourNumberSum(array4Test.getArray(), 74);

        System.out.print("Numbers that make up target sum of " + 74 + ": ");
        for (int i = 0; i < fourNumberSum.length; i++) {
            System.out.println("");
            for (int j = 0; j < fourNumberSum[i].length; j++) {
                System.out.print(fourNumberSum[i][j] + ", ");
            }
        }

        System.out.println("\n\n-----------------------------------------\n\n");
    }
}
