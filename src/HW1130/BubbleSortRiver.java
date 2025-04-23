package HW1130;

public class BubbleSortRiver {
    static void bubbleSort(Country2[] arr1, Country2.River[] arr) {
        int n = arr.length;
        Country2.River temp = arr[0];
        Country2 temp1 = arr1[0];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1].length > arr[j].length) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    temp1 = arr1[j - 1];
                    arr1[j - 1] = arr1[j];
                    arr1[j] = temp1;
                }
            }
        }
    }
}
