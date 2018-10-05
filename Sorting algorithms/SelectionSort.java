
import java.util.Scanner;

public class SelectionSort
{
	void selectionSort(int arr[])
	{
		int n = arr.length;

		// Move the boundary of unsorted subarray one by one
		for (int i = 0; i < n-1; i++)
		{
			// Find the minimum element in unsorted array
			int min = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min])
					min = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
public static void main(String args[]) 
    { 
        SelectionSort ob = new SelectionSort(); 
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter number of elements to be sorted: ");
        int num=sc.nextInt();
        int array[] = new int[num]; 
        
        System.out.println("Enter array elements");
         for(int i=0; i< num; i++){
             array[i] = sc.nextInt();
        }
        
         ob.selectionSort(array); 
         System.out.println("Array after selection sort.."); 
        
        for(int i=0;i<num;i++){
            System.out.print(array[i] + " ");  
        } 
    } 
}
