package com.stream_API_mcq;

import java.util.ArrayList;
import java.util.List;

public class Program_18 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(9);
		al.add(10);
		al.add(11);
		al.add(12);
		List<Integer> list = al.stream().dropWhile(x->x<=10).toList();
		System.out.println(list);
		}
}

//[11, 12]