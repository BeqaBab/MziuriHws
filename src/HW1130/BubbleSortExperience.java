package HW1130;

public class BubbleSortExperience {
    static void bubbleSort(Doctor[] arr) {
        int n = arr.length;
        Doctor temp = arr[0];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1].experience < arr[j].experience) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
