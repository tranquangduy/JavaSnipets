
public class InsertionSort {

	private void printArray(int[] unsortedArrayInt) {
		for (int number : unsortedArrayInt) {
			System.out.print(number + " ");
		}
	}
	
	public void sort(int[] array) {
		for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++)
		{
			int newElement = array[firstUnsortedIndex];
			int i;
			for(i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--)
			{
				array[i] = array[i - 1];
			}
			array[i] = newElement;
		
		}
	}
	
//	public static void main(String[] args) {
//		int[] array = new int[] { 41, 89, 45, 29, 26, 12, 13, 50, 9 };
//		InsertionSort insertionSort = new InsertionSort();
//		insertionSort.sort(array);
//		insertionSort.printArray(array);
//	}

}
