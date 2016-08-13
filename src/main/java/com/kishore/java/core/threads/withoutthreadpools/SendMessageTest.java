package com.kishore.java.core.threads.withoutthreadpools;

import java.util.ArrayList;
import java.util.List;

public class SendMessageTest {

	public static void main(String[] args) {

		@SuppressWarnings("unchecked")
		List<MessageBean> messageBeans = new ArrayList();

		for (int i = 1; i <= 10000; i++) {
			messageBeans.add(new MessageBean("UserId : " + i, "Message to send to msg is :  " + i));
		}

		
		/// this is creating multiple thread and running parallel 
		
		SendMessagesThread messagesThread1 = new SendMessagesThread(messageBeans.subList(0, 999));
		Thread singleThread1 = new Thread(messagesThread1);
		singleThread1.start();
		
		
		SendMessagesThread messagesThread2 = new SendMessagesThread(messageBeans.subList(1000, 1999));
		Thread singleThread2 = new Thread(messagesThread2);
		singleThread2.start();
		
		SendMessagesThread messagesThread3 = new SendMessagesThread(messageBeans.subList(2000, 2999));
		Thread singleThread3 = new Thread(messagesThread3);
		singleThread3.start();
		
		SendMessagesThread messagesThread4 = new SendMessagesThread(messageBeans.subList(3000, 3999));
		Thread singleThread4 = new Thread(messagesThread4);
		singleThread4.start();
		
		SendMessagesThread messagesThread5 = new SendMessagesThread(messageBeans.subList(4000, 4999));
		Thread singleThread5 = new Thread(messagesThread5);
		singleThread5.start();
		
		SendMessagesThread messagesThread6 = new SendMessagesThread(messageBeans.subList(5000, 5999));
		Thread singleThread6 = new Thread(messagesThread6);
		singleThread6.start();
		
		SendMessagesThread messagesThread7 = new SendMessagesThread(messageBeans.subList(6000, 6999));
		Thread singleThread7 = new Thread(messagesThread7);
		singleThread7.start();
		
		SendMessagesThread messagesThread8 = new SendMessagesThread(messageBeans.subList(7000, 7999));
		Thread singleThread8 = new Thread(messagesThread8);
		singleThread8.start();
		
		SendMessagesThread messagesThread9 = new SendMessagesThread(messageBeans.subList(8000, 8999));
		Thread singleThread9 = new Thread(messagesThread9);
		singleThread9.start();
		
		SendMessagesThread messagesThread10 = new SendMessagesThread(messageBeans.subList(9000, 9999));
		Thread singleThread10 = new Thread(messagesThread10);
		singleThread10.start();
		
		

	}

}
