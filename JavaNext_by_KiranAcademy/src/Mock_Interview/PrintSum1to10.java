package Mock_Interview;

public class PrintSum1to10 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=2;i<=10;i+=2)
			sum=sum+i;
		System.out.println("Even:"+sum);
		
		int summ=0;
		for(int i=1;i<=10;i+=2)
			summ=summ+i;
		System.out.println("Odd:"+summ);
	}
}
