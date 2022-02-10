package ArrayChallenges;
import java.util.ArrayList;

public class Array3 {
    private int[] array;

    public Array3() {
        this.setArray(new int[]{1, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    public int[][] threeNumberSum(int[] array, int targetSum) {
        //-- Before anything happens, we are making sure the array is not empty
        if (array.length == 0) {
            return new int[][]{};
        }

        //-- ArrayList that will contain arrays with the sets of numbers that equal target sum
        ArrayList<int[]> temp = new ArrayList<>();

        //-- 3 Nested for loops to find the which 3 numbers equal the target sum
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == targetSum) {
                        int []tempArray = new int[]{array[i], array[j], array[k]};
                        temp.add(tempArray);
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
