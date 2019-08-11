package com.learn.interfaces;

public interface InterfaceB {
	void fun();
	
	default void show() {
		System.out.println("Interface B");
	}
}
