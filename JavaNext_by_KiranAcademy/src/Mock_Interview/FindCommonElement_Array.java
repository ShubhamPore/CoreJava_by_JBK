package Mock_Interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElement_Array {
	public static void Find(String[] arr1,String[] arr2)
	{
		Set<String> set=new HashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					set.add(arr1[i]);
				break;
				}
			}
		}
		for(String i:set)
			System.out.println(i+" ");
	}
	public static void main(String[] args) {
		String[] arr1= {"volvo","BMW","Mercedes","Audi"};
		String[] arr2= {"BMW","Audi","Mazda","Tata"};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println("Find Elements:");
		Find(arr1,arr2);
	}
}
//
//	 private static void FindCommonElemet(String[] arr1,
//             String[] arr2)
//{
//Set<String> set = new HashSet<>();
//for (int i = 0; i < arr1.length; i++) {
//for (int j = 0; j < arr2.length; j++) {
//if (arr1[i] == arr2[j]) {
//
//// add common elements
//set.add(arr1[i]);
//break;
//}
//}
//}
//for (String i : set) {
//System.out.print(i + " ");
//}
//}
//
//// main method
//public static void main(String[] args)
//{
//
//// create Array 1
//String[] arr1
//= { "Article", "in", "Geeks", "for", "Geeks" };
//
//// create Array 2
//String[] arr2 = { "Geeks", "for", "Geeks" };
//
//// print Array 1
//System.out.println("Array 1: "
//+ Arrays.toString(arr1));
//
//// print Array 2
//System.out.println("Array 2: "
//+ Arrays.toString(arr2));
//
//System.out.print("Common Elements: ");
//
//// Find the common elements
//FindCommonElemet(arr1, arr2);
//}

