package in.my.main;

import in.my.sorting.Sort;

public class BinarySearch {
	Sort sortingimpl = null;

	public Sort getSortingimpl() {
		return sortingimpl;
	}

	public void setSortingimpl(Sort sortingimpl) {
		this.sortingimpl = sortingimpl;
	}

	public Boolean Search (int[] array) {
		
 		System.out.println("Implementing binary search" );
 		sortingimpl.sort(array);
		System.out.println("Returning the value ");
		return true;
	}

}
