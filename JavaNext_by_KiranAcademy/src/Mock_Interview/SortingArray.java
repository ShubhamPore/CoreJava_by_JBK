package Mock_Interview;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		int arr[]= {7,3,2,6,8,4};
		System.out.println("Original Array:");
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("Sorted Array:");
		for(int num:arr)
			System.out.print(num+" ");
	}

}
