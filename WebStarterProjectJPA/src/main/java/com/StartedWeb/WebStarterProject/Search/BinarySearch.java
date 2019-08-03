package com.StartedWeb.WebStarterProject.Search;

import com.StartedWeb.WebStarterProject.Sort.Sort;

public class BinarySearch {
	
	
	Sort sortingimpl;

	public BinarySearch(Sort sortingimpl) {
		super();
		this.sortingimpl = sortingimpl;
	}

	public Boolean Search(int[] arr , int number) {
 		System.out.println("Implementing binary search" );
 		for(int i:arr) {
 			System.out.println("value is present");
 			if(i == number) {
 			 return true;
 			}
 		}
 		return false;
	}

}
