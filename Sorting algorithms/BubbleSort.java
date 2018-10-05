import java.util.Scanner;
/**
 *
 * @author BrundaSreedhar
 */
public class BubbleSort {
    void bubbleSort(int array[]) 
    { 
        int n = array.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (array[j] > array[j+1]) 
                { 
                    // swap temp and array[i] 
                    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
                } 
    } 
     public static void main(String args[]) 
    { 
        BubbleSort ob = new BubbleSort(); 
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter number of elements to be sorted: ");
        int num=sc.nextInt();
        int array[] = new int[num]; 
        
        System.out.println("Enter array elements");
         for(int i=0; i< num; i++){
             array[i] = sc.nextInt();
        }
        
         ob.bubbleSort(array); 
         System.out.println("Array after bubble sort.."); 
        
        for(int i=0;i<num;i++){
            System.out.print(array[i] + " ");  
        } 
    } 
    
}
