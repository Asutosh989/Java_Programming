class QuickSort 
{ 
    /* Assumes a pivot element and places it correctly,
    consequently places all elements smaller than pivot to it's left
    and bigger elements to it's right */
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
  
  
    // The main function that implements QuickSort() 
   
    void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            // pi is partitioning index
            int pi = partition(arr, low, high); 
  
            // Recursively sorting elements before 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 

    public static void main(String args[]) 
    { 
        int arr[] = {5, 7, 2, 10, 17, 4, 3}; 
        int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println();     } 
} 