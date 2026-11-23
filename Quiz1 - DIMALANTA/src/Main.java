
public class Main {

    public static void main(String[] arg){

        int[] numbers = new int[10];

        numbers[0] = 67;
        numbers[1] = 69;
        numbers[2] = 9;
        numbers[3] = 16;
        numbers[4] = -6;
        numbers[5] = 967;
        numbers[6] = 97;
        numbers[7] = 79;
        numbers[8] = 697;
        numbers[9] = 70;

        System.out.println("Before bubble sorting:");
        printSortedArray(numbers);

        bubbleSort(numbers);

        System.out.println("\n\nAfter bubble sorting:");
        printSortedArray(numbers);
    }

    private static void bubbleSort(int[]arr){
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {

            int largestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }


    private static void printSortedArray(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
