package com.ty;

import java.util.Map;

public class Shop {
	private String name;
	private Map<String, Double> items;
	
	public Shop(String name, Map<String, Double> items) {
		this.name = name;
		this.items = items;
	}
	public void shopName() {
		System.out.println("Shop Name is : "+name);
		System.out.println("==========Items=========");
		for(Map.Entry<String, Double> entry : items.entrySet()) {
			System.out.println(entry.getKey()+"----->"+entry.getValue());
		}
	}
	
	

}
