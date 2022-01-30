package ArrayChallenges;

public class Array1 {
    private int[] Array;

    public Array1() {
        this.Array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public int[] getArray() {
        return this.Array;
    }

    public int[] minMaxNum(int[] numList){
        int smallest;
        int largest = 0;
        int[] minMaxArray;

        //-- My way of checking if the list is empty
        //-- Try setting "smallest" to the number @ idx 0
        //-- If the list is empty, it will throw an index out of bounds exception
        //-- If exception is thrown, we can simply return an empty array
        //-- Otherwise, list is not empty and we can successfully initialize "smallest"
        try{
            smallest = numList[0];
        } catch (Exception e) {
            minMaxArray = new int[]{};
            return minMaxArray;
        }

        //-- Loop through the array
        //-- Find smallest and largest int
        for (var elem : numList) {
            if (elem <= smallest) {
                smallest = elem;
            }
            if (elem >= largest) {
                largest = elem;
            }
        }

        //-- Set largest and smalles int to array
        minMaxArray = new int[]{smallest, largest};

        return minMaxArray;
    }
}
