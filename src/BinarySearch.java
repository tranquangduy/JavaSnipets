// Java implementation of binary search
public class BinarySearch {
	
	/*
	 * int arr: array to search, must be sorted. If not the function will return -1.
	 * int l: first index of arr[]
	 * int r: length of arr[]
	 * int x: number to search
	 */
	int binarySearch(int arr[], int l, int r, int x)
	{
		if(r >= 1)
		{
			int mid = l + (r - 1)/2;
			
			// if the middle is the number, return itself
			if(arr[mid] == x) return mid;
			
			//if the middle is greater than the number to find, the number must be on the left site of the array
			if(arr[mid] > x) return binarySearch(arr, l, mid-1, x);
			
			//else the middle is smaller than the number to find, the number must be on the right site of the array
			else return binarySearch(arr, mid+1, r , x);
		}
		
		// when the number is not present in the array, return -1
		return -1;
	}
	
	
	

//	public static void main(String[] args) {
//		
//		BinarySearch ob = new BinarySearch(); 
//        int arr[] = {2,3,4,10,40}; 
//        int n = arr.length; 
//        int x = 10; 
//        int result = ob.binarySearch(arr,0,n-1,x); 
//        if (result == -1) 
//            System.out.println("Element not present"); 
//        else
//            System.out.println("Element found at index " +  
//                                                 result); 
//
//	}

}
