 package com.StartedWeb.WebStarterProject.Search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StartedWeb.WebStarterProject.Search.Entity.SearchSetEntity;
import com.StartedWeb.WebStarterProject.repository.SearchSetRepository;

@Service
public class MyApp {
	
	@Autowired
	BinarySearch bubblesortbinarysearch;
	
	@Autowired
	BinarySearch quicksortbinarysearch;
	
	@Autowired
	SearchSetRepository searchsetrepo;
	
	
	public boolean mainSearch(int number) {
		int arr[] = {1 , 2, 3 , 4, 5 };
		//performBubbleSortBasedSearch(arr , number);
		return quickSortBasedSearch(arr , number);
	}

	private  boolean quickSortBasedSearch(int[] arr ,  int number) { 
		boolean quickvalue = quicksortbinarysearch.Search(arr , number);
		System.out.println("the sorted value is " + quickvalue);
		return quickvalue;
	}
	
	private void performBubbleSortBasedSearch(int[] arr , int number) {
		Boolean bubblevalue = bubblesortbinarysearch.Search(arr , number);
		System.out.println("the sorted value is " + bubblevalue);
	}
	
	public SearchSetEntity saveSearchSet(SearchSetEntity newsearchset) {
		return searchsetrepo.save(newsearchset);
	}

	public void setBubblesortbinarysearch(BinarySearch bubblesortbinarysearch) {
		this.bubblesortbinarysearch = bubblesortbinarysearch;
	}
	public void setQuicksortbinarysearch(BinarySearch quicksortbinarysearch) {
		this.quicksortbinarysearch = quicksortbinarysearch;
	}

}
