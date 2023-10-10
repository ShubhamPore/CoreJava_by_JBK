package Mock_Interview;

import java.util.Scanner;

public class Prime_No {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the No:");
	int num=scan.nextInt();
	
	boolean flag=false;
	for(int i=2;i<=num/2;i++)
		if(num%i==0)
		{
			flag=true;
			break;
		}
	if(!flag)
		System.out.println("This is Prime");
	else
		System.out.println("This is not Prime");
		
		
	}
	
}
