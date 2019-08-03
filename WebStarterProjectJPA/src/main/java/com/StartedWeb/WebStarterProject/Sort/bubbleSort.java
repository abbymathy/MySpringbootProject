package com.StartedWeb.WebStarterProject.Sort;

import org.springframework.stereotype.Component;

@Component
public class bubbleSort implements Sort {
	public int[] sort(int[] valuetobesorted) {
		System.out.println("doing bubble sort");
		return valuetobesorted;
	}
}
