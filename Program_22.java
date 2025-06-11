package com.stream_API_mcq;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program_22 {
	
	{
	List<List<String>> data = Arrays.asList(
	Arrays.asList("a", "b"),
	Arrays.asList("c", "d"));

	List<String> result = data.stream()
	.flatMap(List::stream)
	.collect(Collectors.toList());

	System.out.println(result);

	}
}

//[1, 2, 3, 4]