package com.kishore.java.core.threads.test;

import com.kishore.java.core.threads.Thread1;
import com.kishore.java.core.threads.Thread2;
import com.kishore.java.core.threads.Thread3;
import com.kishore.java.core.threads.Thread4;
import com.kishore.java.core.threads.Thread5;

public class ThreadsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ThreadsTest test=new ThreadsTest();
		test.callingMultipleThreads();
		
	}
	
	public void callMe(){
		try {
			wait(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		notify();
		System.out.println("Test Me");
		
	}
	
	public void callingMultipleThreads(){
		
		
		Thread1 thread1=new Thread1();
		Thread threadmain1=new Thread(thread1);
		threadmain1.setPriority(Thread.MIN_PRIORITY);
		threadmain1.start();
		
		Thread2 thread2=new Thread2();
		Thread threadmain2=new Thread(thread2);
		threadmain2.setPriority(Thread.MIN_PRIORITY);
		threadmain2.start();
		
		Thread3 thread3=new Thread3();
		Thread threadmain3=new Thread(thread3);
		threadmain3.setPriority(Thread.NORM_PRIORITY);
		threadmain3.start();
		
		Thread4 thread4=new Thread4();
		Thread threadmain4=new Thread(thread4);
		threadmain4.setPriority(Thread.MAX_PRIORITY);
		threadmain4.start();
		
		Thread5 thread5=new Thread5();
		Thread threadmain5=new Thread(thread5);
		threadmain5.setPriority(Thread.MAX_PRIORITY);
		threadmain5.start();
		
		
	
		
		
		
		
		
		try {
			threadmain1.join();
			threadmain2.join();
			threadmain3.join();
			threadmain4.join();
			threadmain5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("thread1.result" + thread1.result);
		System.out.println("thread2.result" + thread2.result);
		System.out.println("thread3.result" + thread3.result);
		System.out.println("thread4.result" + thread4.result);
		System.out.println("thread5.result" + thread5.result);
		
		int finalResult = thread1.result+ thread2.result+ thread3.result+ thread4.result+ thread5.result;
		System.out.println("total value of the all the threads : " + finalResult);
		/*try {
			threadmain1.wait(10*1000);
			
		} catch (InterruptedException  e) {
			e.printStackTrace();
		}
		notify();*/
		
	}

}
