package com.op;

public class Sum_of_all_subset {

	static int xorSum(int arr[], int n) {
		int bits = 0;
		for (int i = 0; i < n; ++i)
			bits |= arr[i];
		int result = bits * (int) Math.pow(2, n - 1);
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 6 };
		int len = arr.length;
		System.out.println(xorSum(arr, len));
	}

}
