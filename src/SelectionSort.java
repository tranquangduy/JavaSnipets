
public class SelectionSort {

	public void swap(int[] array, int index1, int index2) {
		int temp;
		temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	public void sort(int[] array) {
		int lastUnsortedIndex, i, largestIndex;
		for (lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			largestIndex = 0;
			for (i = 1; i <= lastUnsortedIndex; i++) {
				if (array[largestIndex] < array[i])
					largestIndex = i;

			}
			swap(array, largestIndex, lastUnsortedIndex);
		}
	}

	private void printArray(int[] unsortedArrayInt) {
		for (int number : unsortedArrayInt) {
			System.out.print(number + " ");
		}
	}

//	public static void main(String[] args) {
//		int[] array = new int[] { 41, 89, 45, 29, 26, 12, 13, 50, 9 };
//		SelectionSort selectionSort = new SelectionSort();
//		selectionSort.sort(array);
//		selectionSort.printArray(array);
//	}
}
