package com.stream_API_mcq;

import java.util.ArrayList;
import java.util.List;

public class Program_21 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		List<Integer> list = al.stream().limit(4).toList();
		System.out.println(list);
		}
}

//[1, 2, 3, 4]
