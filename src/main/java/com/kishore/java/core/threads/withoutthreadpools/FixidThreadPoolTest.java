package com.kishore.java.core.threads.withoutthreadpools;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixidThreadPoolTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("unchecked")
		List<MessageBean> messageBeans = new ArrayList();

		for (int i = 1; i <= 10000; i++) {
			messageBeans.add(new MessageBean("UserId : " + i, "Message to send to msg is :  " + i));
		}

		
		ExecutorService executorService=Executors.newFixedThreadPool(10);
		
		executorService.submit(new SendMessagesThread(messageBeans.subList(0, 999)));
		executorService.submit(new SendMessagesThread(messageBeans.subList(1000, 1999)));
		executorService.submit(new SendMessagesThread(messageBeans.subList(2000, 2999)));
		executorService.submit(new SendMessagesThread(messageBeans.subList(3000, 3999)));
		executorService.submit(new SendMessagesThread(messageBeans.subList(4000, 4999)));
		executorService.submit(new SendMessagesThread(messageBeans.subList(5000, 5999)));
		executorService.submit(new SendMessagesThread(messageBeans.subList(6000, 6999)));
		executorService.submit(new SendMessagesThread(messageBeans.subList(7000, 7999)));
		executorService.submit(new SendMessagesThread(messageBeans.subList(8000, 8999)));
		executorService.submit(new SendMessagesThread(messageBeans.subList(9000, 9999)));
		
		executorService.shutdown();
		
		
	}

}
