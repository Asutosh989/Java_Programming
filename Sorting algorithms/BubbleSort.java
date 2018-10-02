package Sorting;

import java.util.Scanner;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n=s.nextInt();
		int[] arr=new int[5];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();
		System.out.println("Array after sorting is: ");
		Bubble_Sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

	public static void Bubble_Sort(int[] arr)
	{
		int temp;
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
}