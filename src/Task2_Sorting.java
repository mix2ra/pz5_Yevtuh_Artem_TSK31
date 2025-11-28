public class Task2_Sorting {

    // Сортування вибором (Selection sort)
    public static void selectionSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // обмін
            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Сортування вставкою (Insertion sort)
    public static void insertionSort(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            double key = arr[i];
            int j = i - 1;

            // пересуваємо елементи, що більші за key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Метод для виводу масиву
    public static void printArray(double[] arr) {
        for (double num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Головний метод
    public static void main(String[] args) {
        double[] arr1 = {64.5, 25.1, 12.9, 22.7, 11.3};
        double[] arr2 = arr1.clone(); // копія для другого методу

        System.out.println("Початковий масив:");
        printArray(arr1);

        // Selection sort
        selectionSort(arr1);
        System.out.println("\nПісля Selection sort:");
        printArray(arr1);

        // Insertion sort
        insertionSort(arr2);
        System.out.println("\nПісля Insertion sort:");
        printArray(arr2);
    }
}