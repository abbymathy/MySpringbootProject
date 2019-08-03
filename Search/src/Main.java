import in.my.sorting.bubbleSort;
import in.my.sorting.quickSort;

public class Main {
	
	BinarySearch bubblesortbinarysearch = null;
	BinarySearch quicksortbinarysearch = null;
	
	public Main() {
		bubblesortbinarysearch = new BinarySearch();
		bubblesortbinarysearch.setSortingimpl(new bubbleSort());
		
		quicksortbinarysearch = new BinarySearch();
		quicksortbinarysearch.setSortingimpl(new quickSort());
		 
	}

	public static void main(String args[]) {	
		Main myapp = new Main();
		myapp.mainSearch();
	}

	private void mainSearch() {
		int arr[] = {1 , 2, 3 , 4, 5 };
		performBubbleSortBasedSearch(arr);
		quickSortBasedSearch(arr);
	}

	private  void quickSortBasedSearch(int[] arr) {
		Boolean quickvalue = bubblesortbinarysearch.Search(arr);
		System.out.println("the sorted value is " + quickvalue);
	}
	
	private void performBubbleSortBasedSearch(int[] arr) {
		Boolean bubblevalue = quicksortbinarysearch.Search(arr);
		System.out.println("the sorted value is " + bubblevalue);
	}


}
