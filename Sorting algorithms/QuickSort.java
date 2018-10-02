public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,1,4,2,15,6,3,9,8,13};
		quicksort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void quicksort(int[] arr,int start,int end)
	{
		int indx = quicksortHelper(arr,start,end);
		if(indx-1>start)	//Left SubArray contains more than 1 element.
			quicksort(arr,start,indx-1);
		if(indx+1<end)	//Right SubArray contains more than 1 element;
			quicksort(arr,indx+1,end);
	}
	
	public static int quicksortHelper(int[] arr,int start,int end)
	{
		int left = start;
		int right = end;
		int pivot = start;
		int temp;
		while(true)
		{
			while(arr[right]>=arr[pivot] && right!=pivot)
				right--;
			if(right==pivot)
				return pivot;
			temp = arr[pivot];
			arr[pivot] = arr[right];
			arr[right] = temp;
			pivot = right;
			while(arr[left]<=arr[pivot] && left!=pivot)
				left++;
			if(left==pivot)
				return pivot;
			temp = arr[pivot];
			arr[pivot] = arr[left];
			arr[left] = temp;
			pivot = left;
		}
	}

}
