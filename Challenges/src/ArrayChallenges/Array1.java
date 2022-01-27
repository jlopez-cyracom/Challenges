package ArrayChallenges;

import java.util.Random;

public class Array1 {
    int[] smallAndLarge;

    public int[] smallestAndLargest(int[] array){
        int smallest = 0;
        int largest = 0;
        int[] returnArray;

        if (array.length <= 0) {
            return this.smallAndLarge; //-- Change this to return an empty list
        }

        //-- Sorts through the array to find smallest and largest
        for (var elem : array) {
            if (elem <= smallest) {
                smallest = elem;
            }
            if (elem >= largest) {
                largest = elem;
            }
        }

        //-- Add smallest and largest to array and return
        returnArray = new int[]{smallest, largest};

        return returnArray;
    }
}
