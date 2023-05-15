package mzerek.mergesort;

//https://www.geeksforgeeks.org/merge-sort/
public class MainMargeSort {

    public static int z = 0;
    public static int y = 0;

    public static void main(String[] str) {
        //int intArray[] = { 16, 11, 18, 7, 4, 9, 1 };
        int intArray[] = {16, 11, 18, 7, 4};
        printArray(intArray, "Initial ");

        sort(intArray, 0, intArray.length - 1, "main");

        printArray(intArray, "End ");
    }

    public static void sort(int[] intArray, int begin, int length, String id) {
        System.out.println("> in sort " + z + " | begin: " + begin + " | length: " + length +" | id: " + id);
        z++;
        System.out.println("condition: " + (begin < length) +" | id: " + id );

        if (begin < length) {
            System.out.println(">>>OK"+" | id: " + id);
            System.out.println();

            int middle = begin + (length - begin) / 2;

            sort(intArray, begin, middle, "sortA" + z);
            sort(intArray, middle + 1, length, "sortB" + z);


            merge(intArray, begin, middle, length, id);
        }
        System.out.println();
    }

    public static void merge(int[] intArray, int begin, int middle, int length, String sortId) {
        y++;
        System.out.println(">>> in merge  " + y + " sort " + sortId + " | begin: " +" | begin: " + begin + " | middle: " + middle + " | length: " + length);

        int sizeTmpLeftArray = middle - begin + 1;
        int sizeTmpRightArray = length - middle;

        int[] tmpLeftArray = new int[sizeTmpLeftArray];
        int[] tmpRightArray = new int[sizeTmpRightArray];

        for (int i = 0; i < sizeTmpLeftArray; ++i) {
            tmpLeftArray[i] = intArray[begin + i];
        }

        for (int i = 0; i < sizeTmpRightArray; ++i) {
            tmpRightArray[i] = intArray[middle + 1 + i];
        }

        int leftIndex = 0;
        int rightIndex = 0;

        int mergeIndex = begin;

        while (leftIndex < sizeTmpLeftArray && rightIndex < sizeTmpRightArray) {
            //System.out.println("in while loop 1");
            if (tmpLeftArray[leftIndex] <= tmpRightArray[rightIndex]) {
                intArray[mergeIndex] = tmpLeftArray[leftIndex];
                leftIndex++;
            } else {
                intArray[mergeIndex] = tmpRightArray[rightIndex];
                rightIndex++;
            }
            mergeIndex++;
        }

        while (leftIndex < sizeTmpLeftArray) {
            intArray[mergeIndex] = tmpLeftArray[leftIndex];
            leftIndex++;
            mergeIndex++;
        }

        while (rightIndex < sizeTmpRightArray) {
            intArray[mergeIndex] = tmpRightArray[rightIndex];
            rightIndex++;
            mergeIndex++;
        }
    }

    public static void printArray(int[] intArray, String message) {
        System.out.println(message);
        System.out.println("==========================");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + "  ");
        }
        System.out.println();
        System.out.println();
    }
}
