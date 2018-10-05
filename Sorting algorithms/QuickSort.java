
import java.util.Scanner;

public class QuickSort
{
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    private int partition(int arr[], int low, int high)
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
 
  /**
  * 
  * @param arr
  * @param low
  * @param high 
  */
 
   void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
 
    public static void main(String args[])
    {
          Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter number of elements to be sorted: ");
        int num=sc.nextInt();
        int array[] = new int[num]; 
        
        System.out.println("Enter array elements");
         for(int i=0; i< num; i++){
             array[i] = sc.nextInt();
        }
        QuickSort ob = new QuickSort();
        ob.quickSort(array, 0, num-1);
        
        for(int i=0;i<num;i++){
            System.out.print(array[i] + " ");  
        } 
    }
}