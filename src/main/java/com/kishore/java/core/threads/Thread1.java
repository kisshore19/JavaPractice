package com.kishore.java.core.threads;

public class Thread1 implements Runnable {
	public int result=0;
	public void run() {
		try {
			System.out.println(this.getClass().getName() + " run method is Started ");
			Thread.sleep(10*1000);
			System.out.println(this.getClass().getName() + " run method is running ");
			result=91;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		/*for (int i = 0; i < 100; i++) {
			System.out.println(this.getClass().getName() + " run method is running " + i + " time");
		}*/

	}

}
