package math_problems;

public class LowestNumber {

    /** INSTRUCTIONS
     * Write a method to find the lowest number from this array.
     */

    public static void main(String[] args) {

        int[] array = new int[] {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123,
                67, 5, 679, 54, 32, 65};

                //initialize with largest possible value
                int smallest = Integer.MAX_VALUE;
                //find smallest element of array
                int index=0;
                while(index<array.length) {
                    //check if smallest is greater than element
                    if(smallest>array[index]) {
                        //update smallest
                        smallest=array[index];
                    }
                    index++;
                }
                System.out.println("The smallest number is : "+ smallest);
            }

            // the smallest number is: 5 
        }

