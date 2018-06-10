package com.types;
	import java.util.LinkedList;
	import java.util.List;

	public class Password1 {
	public static void main(String[] args) {
	int result = findPassword(223344, 234, 778899, 55675632, 556677);
	System.out.println(result);
	}

	public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
	int total = 0;
	if (!findStable(input1)) {
	total = total + input1;
	}
	if (!findStable(input2)) {
	total = total + input2;
	}
	if (!findStable(input3)) {
	total = total + input3;
	}
	if (!findStable(input4)) {
	total = total + input4;
	}
	if (!findStable(input5)) {
	total = total + input5;
	}
	return total;
	}

	public static boolean findStable(int input) {

	int[] freqs = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	for (int i = input; i > 0; i /= 10) {
	freqs[i % 10]++; // increment the appropriate digits frequency
	}
	int i = 0;
	List<Integer> result = new LinkedList<Integer>();
	for (int item : freqs) {
	if (item != 0) {
	result.add(item);
	}
	}
	boolean equals = true;
	for (int j = 1; j < result.size(); j++) {
	if (result.get(0) != result.get(j)) {
	equals = false;
	}
	}
	System.out.println("result == " + equals);
	return equals;
	}
	}