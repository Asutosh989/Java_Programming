class BubbleSort {
	private static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0 ; i < n - 1 ; i++) {
            for (int j = 0 ; j < n - i - 1 ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {64, 25, 12, 22, 11};
        System.out.println("Original array");
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        sort(arr);
        System.out.println("Sorted array");
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}