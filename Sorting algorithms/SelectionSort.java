class SelectionSort 
{ 
    void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // moving boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Finding the minimum element
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swapping minimum element with the first element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
  
       public static void main(String args[]) 
    { 
        SelectionSort ob = new SelectionSort(); 
        int arr[] = {5, 7, 2, 10, 17, 4, 3}; 
        ob.sort(arr); 
        System.out.println("The sorted array"); 

        //displaying the array
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 

    } 
} 