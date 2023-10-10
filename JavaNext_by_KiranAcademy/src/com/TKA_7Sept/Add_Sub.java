package com.TKA_7Sept;

public class Add_Sub {
	public static int calSum(int no)
	{
	int sum=0;
	for(int i=1;i<no;i++)
		sum=sum+i;
	return sum;
	public static int calEven(int no)
	{
		int sum=0;
		for(int i=1;i<no;++i)
			if(i%2==0)
				sum=sum+i;
		return sum;
	}

}
}
