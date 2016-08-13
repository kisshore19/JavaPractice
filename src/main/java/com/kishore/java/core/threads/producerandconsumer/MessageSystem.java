package com.kishore.java.core.threads.producerandconsumer;

/* MessageSystem.java: A message system that demonstrate the produce and
 consumer problem with the message queue example. */


public class MessageSystem {
	
	public static void main(String[] args) {
		
		MessageQueue queue = new MessageQueue(5);
		
		new Producer(queue).start();
		
		try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Consumer(queue).start();
		
	}
} // end MessageSystem class