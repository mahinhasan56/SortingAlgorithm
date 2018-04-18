package com.FaysalBinHasan;

import java.util.*;

public class SortingAlgorithm {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int[] a = { 49, 20, 51, 64, 93, 145, 67, 86, 56, 96, 74 };

		int[] myarray = Sort(a, 0);
		for (int i = 0; i < myarray.length; i++) {
			System.out.println(myarray[i]);
		}
	}

	public static int[] Sort(int[] array, int i) {
		if (i >= array.length - 1) {
			return array;
		}
		int min = i;
		for (int j = i + 1; j < array.length; j++) {
			if (array[j] < array[min]) {
				min = j;
			}
		}
		if (min != i) {
			int swap = array[i];
			array[i] = array[min];
			array[min] = swap;

		}
		return Sort(array, ++i);
	}
}
