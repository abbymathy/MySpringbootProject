package com.StartedWeb.WebStarterProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StartedWeb.WebStarterProject.Search.MyApp;
import com.StartedWeb.WebStarterProject.Search.Entity.SearchSetEntity;


@RestController
public class SearchController {

	@Autowired
	MyApp binarysearch;
	
	@GetMapping("/search/{numbertobesearched}")
	public boolean isnumberpresent(@PathVariable int numbertobesearched) {
		return binarysearch.mainSearch(numbertobesearched);
	}
	
	@PostMapping("/search")
	public SearchSetEntity addSearchSet(@RequestBody SearchSetEntity newSearchset) {
		System.out.println(newSearchset.toString());
		SearchSetEntity savedvalue = binarysearch.saveSearchSet(newSearchset);
		System.out.println(savedvalue.toString());
		return newSearchset;
	}
}
