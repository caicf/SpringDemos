package com.bean;

public class AmericanImpl implements Person {

	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void  speak() {
		
		System.out.println("American:"+this.name+"+++++"+this.age);
	}
	
}
