package com.stream_API_mcq;

import java.util.ArrayList;
import java.util.List;

public class Program_4 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(12);
		list.add(114);
		List<Integer> list2 = list.stream().distinct().toList();
		System.out.println(list2);
		}
}

//[12, 13, 114]