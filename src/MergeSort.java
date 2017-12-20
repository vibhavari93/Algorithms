
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int [] arr = {3,5,1,8,6,2,10,9};
		int low = 0;
		int high = (arr.length) - 1;
		System.out.println("The unsorted array is " + arr);
		int [] arr_new = sort(arr,low,high);
		System.out.println("Sorted array "+ arr_new);
		

	}
	
	public static int [] sort(int [] arr, int low, int high) {
		
		if(high <= 1)
				return arr;
		
		else {
			
			int mid = (low + high)/2;
			sort(arr,low,mid);
			sort(arr,mid+1,high);
			int [] arr_n = merge(arr,low,mid,high);
			return arr_n;
			
			
			
		}
	}
		
		public static int [] merge(int arr1[],int low1, int mid, int high) {
			
			int n1 = mid - low1;
			int n2 = high - (mid +1);
			int left[] = null;
			int right[] = null;
			
			for(int i = 0; i < n1; i++)
				left[i] = arr1[i + low1];
			for(int j = 0; j < n2; j++)
				right[j] = arr1[j + n2];
			
			int i = 0;
			int j = 0;
			int k = 1;
			
			while(i<n1 && j<n2)
			{
				if (left[i] < right[j])
				{
					arr1[k] = left[i];
					i++;
					
				}
				
				else {
					arr1[k] = right[j];
					j++;
					
				}
				k++;
						
				
				
			}
			return arr1;
			
					
			
			
			
			
		}
		
		
		
		
		
	}

	


	

