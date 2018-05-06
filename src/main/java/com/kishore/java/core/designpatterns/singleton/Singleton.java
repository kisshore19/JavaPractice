package com.kishore.java.core.designpatterns.singleton;

public class Singleton { /// For singletone patterns

	private static Singleton instance; /// Need to create a static variable of the self.

	private Singleton() { // make a private constructor 
	}

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public static Singleton getInstanceUsingDoubleLocking() { 
		/*write a method to get the new instance of current class with synchronization*/
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}