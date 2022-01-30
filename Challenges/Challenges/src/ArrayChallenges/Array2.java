package ArrayChallenges;

public class Array2 {
    private int[] array;

    public Array2() {
        this.array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public int[] getArray() {
        return this.array;
    }

    public int[] twoNumberSum(int[] numList, int targetSum) {
        int numCheck;
        int counter = 0;
        int num1 = 0;
        int num2 = 0;
        int [] numberSum;

        //-- My way of checking if the array being passed is empty
        //-- See minMaxNum() in "Array1.java" for more info on how this works
        try {
            numCheck = numList[counter];
        } catch (Exception e) {
            numberSum = new int[]{};
            return numberSum;
        }

        //-- Loops array trying to find numbers that equal "targetSum"
        for (var elem : numList) {
            if (numCheck + elem == targetSum) {
                num1 = numCheck;
                num2 = elem;
            }
            counter++;
        }

        //-- Checks to see if array contains two numbers that equal "targetSum"
        //-- If no numbers found, then it will return an empty array
        if (num1 == 0 && num2 == 0) {
            numberSum = new int[]{};
            return numberSum;
        }

        numberSum = new int[]{num1, num2};

        return numberSum;
    }
}
