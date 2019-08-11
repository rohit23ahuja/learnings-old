package com.learn.interfaces;

public interface InterfaceA {
	void fun();
	
	default void show() {
		System.out.println("Interface A");
	}
	
}
