package org.dup;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamConditions {
	public static void main(String[] args) {

		List<Integer>list=Arrays.asList(11,12,13,14,15,16,17,1,8,19,20);
		System.out.println("List of num ");
		list.forEach(p-> System.out.println(p));
		 
		List<Integer>al=list.stream().filter(p-> p<15)
				.collect(Collectors.toList());
		System.out.println(al);
		



	}
}





