import java.util.Scanner;
 public class SelectionSort {
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of array: ");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();
		Selection_Sort(arr);
		System.out.println("Array after sorting: ");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
 	public static void Selection_Sort(int[] arr)
	{
		int min,temp;
		for(int i=0;i<arr.length-1;i++)
		{
			min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
					min=j;
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}
	
}
