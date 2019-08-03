package com.StartedWeb.WebStarterProject.WebStarterProjectJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jms.annotation.EnableJms;

import com.StartedWeb.WebStarterProject.Search.BinarySearch;
import com.StartedWeb.WebStarterProject.Sort.bubbleSort;
import com.StartedWeb.WebStarterProject.Sort.quickSort;


@SpringBootApplication
@EnableJpaRepositories("com.StartedWeb.WebStarterProject")
@EntityScan("com.StartedWeb.WebStarterProject")
@ComponentScan("com.StartedWeb.WebStarterProject.*")
@EnableJms
public class WebStarterProjectJpaApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(WebStarterProjectJpaApplication.class); 
	
	public static void main(String[] args) {
		LOGGER.debug("Before calling app");
		SpringApplication.run(WebStarterProjectJpaApplication.class, args);
	}
    @Autowired
	bubbleSort bubblesort;
	
	@Autowired
	quickSort quicksort;
	
	@Bean
	public BinarySearch bubblesortbinarysearch() {	
	return new BinarySearch(bubblesort);
	}
	
	@Bean
	public BinarySearch quicksortbinarysearch() {	
	return new BinarySearch(quicksort);
	}
}
