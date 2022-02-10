package ArrayChallenges;

import java.util.ArrayList;

public class Array4 {
    private int[] array;

    public Array4() {
        this.setArray(new int[]{1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
    }

    public int[][] fourNumberSum(int[] array, int targetSum) {
        //-- Before anything happens, we are making sure the array is not empty
        if (array.length == 0) {
            return new int[][]{};
        }

        //-- ArrayList that will contain arrays with the sets of numbers that equal target sum
        ArrayList<int[]> temp = new ArrayList<>();

        //-- 4 Nested for loops to find the which 4 numbers equal the target sum
        for (int i = 0; i < array.length - 3; i++) {
            for (int j = i + 1; j < array.length - 2; j++) {
                for (int k = j + 1; k < array.length - 1; k++) {
                    for (int l = k + 1; l < array.length; l ++) {
                        if (array[i] + array[j] + array[k] + array[l] == targetSum) {
                            int[] tempArray = new int[]{array[i], array[j], array[k], array[l]};
                            temp.add(tempArray);
                        }
                    }
                }
            }
        }

        //-- Returns the 2D array containing all the sets
        return toIntArray(temp);
    }

    //-- Created this function to create ArrayLists to 2D arrays
    public int[][] toIntArray(ArrayList<int[]> arrayList) {
        int[][] array = new int[arrayList.size()][];

        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }

        return array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
