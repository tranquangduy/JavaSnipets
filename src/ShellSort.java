
public class ShellSort {
	
	private void printArray(int[] unsortedArrayInt) {
		for (int number : unsortedArrayInt) {
			System.out.print(number + " ");
		}
	}
	
	private void sort(int[] array)
	{
		for(int gap = array.length/2; gap > 0; gap /= 2)
		{
			for(int i = gap; i < array.length; i++)
			{
				int newElement = array[i];
				int j = i;
				while (j >= gap && array[j - gap] > newElement)
				{
					array[j] = array[j - gap];
					j -= gap;
				}
				
				array[j] = newElement;
			}
		}

	}

	public static void main(String[] args) {
		int[] array = new int[] { 41, 89, 45, 29, 26, 12, 13, 50, 9 };
		ShellSort shellSort = new ShellSort();
		shellSort.sort(array);
		shellSort.printArray(array);
	}

}
