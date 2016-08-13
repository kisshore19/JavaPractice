package com.kishore.java.core.threads.withoutthreadpools;

import org.apache.log4j.Logger;

public class MessageGateway {
	Logger logger = Logger.getLogger(this.getClass());

	public boolean sendMessage(MessageBean messageBean) {
		//System.out.println("Message sent to the user : " + messageBean.getUserId() + " : Message Is :  " + messageBean.getMessage());
		return true;
	}

}
