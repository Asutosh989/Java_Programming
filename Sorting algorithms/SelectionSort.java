import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    private void sort(int[] arr)
    {
        int size=arr.length;

        for(int i=0;i<size-1;i++)
        {
            int min_index=i;

            //find minimum element in unsorted array
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]<arr[min_index])
                {
                    min_index=j;
                }
            }

            // Swap the found minimum element with the first element
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter number of elements");
        int n = s.nextInt();
        System.out.println("Enter elements");
        int arr[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = s.nextInt();
        }
        SelectionSort ob=new SelectionSort();
        ob.sort(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}
