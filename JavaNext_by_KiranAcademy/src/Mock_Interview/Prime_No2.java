package Mock_Interview;

public class Prime_No2 {
	public static void main(String[] args) {
//		int num=2;
//		int count=0;
//		for(int i=1;i<=num;i++)
//		{
//			if(num%i==0)
//			{
//				count++;
//			}
//		}
//		if(count==2)
//			System.out.println("This is Prime");
//		else
//			System.out.println("This is not Prime");
		
	int num=7;
	int count=0;
	for(int i=0;i<=num;i++)
	{
		if(num%i==0)
		{
			count++;
		}
		if(count==2)
			System.out.println("This is prime");
		else
			System.out.println("This is not prime"
					+ "");
	}
	}

}
