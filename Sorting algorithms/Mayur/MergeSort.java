public class MergeSort {
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,7,10,6,9,3};
		int[] ans=MergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(ans[i]+" ");
	}
 	public static int[] MergeSort(int[] arr,int low,int high)
	{
		if(low==high)
		{
			int[] a = {arr[high]};
			return a;
		}
		int mid = (low+high)/2;
		int[] fhalf = MergeSort(arr,low,mid);
		int[] shalf = MergeSort(arr,mid+1,high);
		int[] sorted = Merge(fhalf,shalf);
		return sorted;
	}
	
	public static int[] Merge(int[] a1,int[] a2)
	{
		int[] ans = new int[a1.length+a2.length];
		int k=0;
		int i=0;
		int j=0;
		while(i<a1.length && j<a2.length)
		{
			if(a1[i]<a2[j])
			{
				ans[k]=a1[i];
				k++;
				i++;
			}
			else
			{
				ans[k]=a2[j];
				k++;
				j++;
			}
		}	
		while(i!=a1.length)
		{
			ans[k]=a1[i];
			k++;
			i++;
		}
		while(j!=a2.length)
		{
			ans[k]=a2[j];
			k++;
			j++;
		}
	return ans;
	}
	
}
