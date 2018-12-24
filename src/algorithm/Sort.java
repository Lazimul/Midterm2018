package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int hole = i;

            while (hole > 0 && list[hole - 1] > temp) {
                list[hole] = list[hole - 1];
                hole = hole - 1;
            }
            list[hole] = temp;
        }



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();
        for (int z = 0; z < list.length - 1; z++) {
            for (int a = 0; a < list.length - 1 - z; a++) {
                if (list[a] > list[a + 1]) {
                    // int temp = list[a];
                    //  list[a] = list[a + 1];
                    //  list[a + 1] = temp;
                }
                int temp = list[a];
                list[a] = list[a + 1];
                list[a + 1] = temp;
            }

        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        
        
        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here
        if (list.length <= 1) {
        

        return list;
    }
        int midpoint = list.length / 2;
        int[] left = new int[midpoint];
        int[] right;
        if (list.length % 2 == 0) {
            right = new int[midpoint];
        } else {
            right = new int[midpoint + 1];
        }
        for (int i = 0; i < midpoint; i++) {
            left[i] = list[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = list[midpoint + j];
        }

        int[] result = new int[list.length];
        left = mergeSort(left);
        right = mergeSort(right);
        result = merge(left, right);
        return result;
    }
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;
        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[resultPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[resultPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer] = right[rightPointer++];
            }
        }
        return result;

    }






    public int [] quickSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        int length = list.length;

        Sort qs = new Sort();
        qs.quickRecursion(list, 0, length - 1);
        qs.printArray(list);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public int partition (int [] arr, int low, int high)//once it is partitioned, we will redo the whole process via recursion
    {
        int pivot = arr[(low+high)/2]; // could be any random number
        while (low<=high)
        {
            while (arr[low] < pivot)
            {
                low++;
            }
            while (pivot < arr[high])
            {
                high--;
            }
            if (low <= high)
            {
                int temp = arr[low]; //swapping the values
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

    public void quickRecursion (int arr[], int low, int high)
    {
        int a = partition(arr, low, high);
        if (low < a-1)
        {
            quickRecursion(arr, low, a-1);//highest index on the left side would be a-1
            //recursion method for left subarray
        }
        if (a < high)
        {
            quickRecursion(arr, a, high);//lowest index on the right side would be a
            //recursion method for right subarray
        }
    }

    public void printArray (int arr[])// print method using for each loop
    {
        for (int i :arr)
        {
            System.out.print(i+ " ");
        }

    }


    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        Sort hs = new Sort();
        hs.sort(list);
        hs.printArray(list);
        int a, b;

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public void sort(int[] arr) {
        int l = arr.length;
        for (int i = l / 2 - 1; i >= 0; i--) {
            heapify(arr, l, i);
        }

        for (int i = l - 1; i <= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public void heapify(int[] array, int n, int i) {
        int largest = i;
        int ls = 2 * i + 1;
        int rs = 2 * i + 2;

        if (ls < n && array[ls] < array[largest])
        {
            largest = ls;
        }

        if (rs > n && array[rs] > array[largest]) {
            largest = rs;

        }
        if (largest != i) {
            int temp = array[i]; //if the value for either left or right child is > parent value,
            // then swap the values
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, n, largest);
        }
    }

    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
