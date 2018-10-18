/**
 * BubbleSort
 * 	bubbleSort(Array A)
	  for (n=A.size; n>1; --n){
	    for (i=0; i<n-1; ++i){
	      if (A[i] > A[i+1]){
	        A.swap(i, i+1)
	      } // Ende if
	    } // Ende innere for-Schleife
	  } // Ende äußere for-Schleife
 * @author duytran
 *
 */
public class BubbleSort {

	public BubbleSort() {
		super();
	}
	
	public void swap (int[] array, int index1, int index2)
	{
		int temp;
		temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	public void sort(int[] unsortedArrayInt)
	{
		for(int i = unsortedArrayInt.length-1; i >= 0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				if(unsortedArrayInt[j]>unsortedArrayInt[j+1])
				{
					this.swap(unsortedArrayInt, j, j+1);
				}
			}
		}
	}
	
	private void printArray(int[] unsortedArrayInt) {
		for(int number : unsortedArrayInt)
		{
			System.out.print(number + " ");
		}
	}


//	public static void main(String[] args) {
//		int[] array = new int[]{41, 89, 45, 29, 26, 12, 13, 50, 9};
//		BubbleSort bubbleSort = new BubbleSort();
//		bubbleSort.sort(array);
//		bubbleSort.printArray(array);
//	}


}
