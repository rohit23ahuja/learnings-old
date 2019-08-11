package com.learn.pattern.builder.lunch.order;

public class LunchOrderBeanDemo {
	public static void main(String[] args) {
		LunchOrderBean lunchOrderBean = new LunchOrderBean();
		lunchOrderBean.setBread("wheat");
		lunchOrderBean.setCondiments("Salt 'N' Pepper");
		lunchOrderBean.setDressing("Thousand Island");
		lunchOrderBean.setMeat("Chicken Salami");
		
		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiments());
		System.out.println(lunchOrderBean.getDressing());
		System.out.println(lunchOrderBean.getMeat());
	}
}
