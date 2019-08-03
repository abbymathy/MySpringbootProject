package com.StartedWeb.WebStarterProject.Sort;

import org.springframework.stereotype.Component;

@Component
public class quickSort implements Sort {
	public int[] sort(int[] valuetobesorted) {
		System.out.println("doing quick sort");
		return valuetobesorted;
	}

}
