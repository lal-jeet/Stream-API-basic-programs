package com.stream_API_mcq;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program_1 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(20);
		arrayList.add(21);
		arrayList.add(22);
		arrayList.add(23);
		List<Integer> collect = arrayList.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList());
		System.out.println(collect);
		}
}

//[23, 22, 21, 20]