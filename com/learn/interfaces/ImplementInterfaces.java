package com.learn.interfaces;

public class ImplementInterfaces implements InterfaceA, InterfaceB {

	@Override
	public void fun() {
		System.out.println("a");
	}

	@Override
	public void show() {
		InterfaceA.super.show();
	}

}
