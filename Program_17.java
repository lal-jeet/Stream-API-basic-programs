package com.stream_API_mcq;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Program_17 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(16);
		list.add(14);
		Optional<Integer> max = list.stream().max((x, y) -> x.compareTo(y));
		System.out.println(max);
		}
}

//Optional[16]
