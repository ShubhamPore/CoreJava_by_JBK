package com.TKA_28Aug;

public class Threading extends Thread {
	public void run()
	{
		for(int i=0;i<=10;i++)
			if(i%2==0)
				System.out.println("Even:"+i+" "+Thread.currentThread());
		
		try {
			Thread.currentThread().sleep(MAX_PRIORITY);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
