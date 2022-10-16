package sorting;

public class SortingAlgorithms {


    /** INSTRUCTIONS
     * You must implement all of the sorting algorithms below. Feel free to add any helper methods that you may need,
     * but make sure they are private, as to not be accessed outside of this class.
     *
     * You must also store the sorted arrays into their own individual database tables (Selection Sort should be stored
     *  in table `selection_sort`, Insertion Sort should be stored in table `insertion_sort`)
     */

    long executionTime = 0;

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public int[] insertionSort(int[] intArray) {
        final long startTime = System.currentTimeMillis();

        for (int idxI = 1; idxI < intArray.length; idxI++) {
            int key = intArray[idxI];
            int idxJ = idxI - 1;
            //
            while (idxJ >= 0 && intArray[idxJ] > key) {
                intArray[idxJ + 1] = intArray[idxJ];
                idxJ--;
            }
            intArray[idxJ + 1] = key;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return intArray;
    }

    public int[] bubbleSort(int[] arr) {

        int n = arr.length;
        int temp = 0;
        for(int i=0; i < arr.length; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public int[] mergeSort(int[] array) {

        final long startTime = System.currentTimeMillis();
        if (array.length < 2) {
            return array;
        }
        int mid = array.length / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[array.length - mid];
        for (int i = 0; i < mid; i++) {
            leftArr[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            rightArr[i - mid] = array[i];
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(array, leftArr, rightArr, mid, array.length - mid);

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public int[] quickSort(int[] array) {

        int low = 0;
        int high = array.length - 1;

        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(array, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(array, low, pi-1);
            sort(array, pi+1, high);
        }

        return array;
    }

    public int[] heapSort(int[] array) {
        // IMPLEMENT HERE

        return array;
    }

    public int[] bucketSort(int[] array) {
        //implement here

        return array;
    }

    public int[] shellSort(int[] array) {
        //implement here

        return array;
    }

    //helper method
    private static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k] = l[i];
                k++;
                i++;
            } else {
                a[k] = r[j];
                k++;
                j++;
            }
        }
        while (i < left) {
            a[k] = l[i];
            k++;
            i++;
        }
        while (j < right) {
            a[k] = r[j];
            k++;
            j++;
        }
    }

    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }


}
