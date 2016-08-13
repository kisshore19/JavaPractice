package com.kishore.java.core.threads.withoutthreadpools;

import java.util.List;

import org.apache.log4j.Logger;

public class SendMessagesThread implements Runnable {
	private final static Logger logger = Logger.getLogger(SendMessagesThread.class.getName());
	private List<MessageBean> listOfMessageBean;

	public SendMessagesThread() {

	}

	public SendMessagesThread(List<MessageBean> listOfMessageBean) {
		this.listOfMessageBean = listOfMessageBean;

	}

	public void run() {
		MessageGateway messageGateway = new MessageGateway();
		System.out.println("Messages started sending total size of messages is : " + listOfMessageBean.size());
		long startTime = System.currentTimeMillis();
		System.out.println("Started time : " + startTime);
		for (MessageBean messageBean : listOfMessageBean) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			messageGateway.sendMessage(messageBean);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("End time : " + endTime);
		System.out.println("For no of messages :" + listOfMessageBean.size() + " process time : " + (endTime - startTime));

	}

}
