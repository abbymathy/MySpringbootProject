package in.my.main;

public class MyApp {
	
	BinarySearch bubblesortbinarysearch = null;
	BinarySearch quicksortbinarysearch = null;
	
	public void mainSearch() {
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

	public void setBubblesortbinarysearch(BinarySearch bubblesortbinarysearch) {
		this.bubblesortbinarysearch = bubblesortbinarysearch;
	}

	public void setQuicksortbinarysearch(BinarySearch quicksortbinarysearch) {
		this.quicksortbinarysearch = quicksortbinarysearch;
	}

}
