package math_problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindLowestDifference {

    /** INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */

    public static void main(String[] args) {

        FindLowestDifference obj = new FindLowestDifference();
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

        int n = obj.lowestNum(array1, array2);
        System.out.println(n);
    }

    public int lowestNum (int[] array1, int[] array2){
        return Arrays.compare(array1,array2);
    }


    }



