package com.stream_API_mcq;

import java.util.ArrayList;
import java.util.List;

public class Program_16 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("BC");
		al.add("CDE");
		al.add("DEFG");
		List<String> list = al.stream().filter(x -> x.length() >= 2).peek(x -> {}).toList();
		System.out.println(list);
		}
}

//[BC, CDE, DEFG]