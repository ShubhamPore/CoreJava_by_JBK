package Mock_Interview;

import java.util.ArrayList;
import java.util.List;

public class FindCommanElementArray {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {2,3,4,7,8};
		List<Integer> ls=new ArrayList<>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					ls.add(arr1[i]);
					break;
				}
			}
		}
		System.out.println("Comman Elements:"+ls);
}

}
