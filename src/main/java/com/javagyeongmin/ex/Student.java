package com.javagyeongmin.ex;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private String age;
	private double height;
	private double weight;
	private ArrayList<String> hobbys;
	
	

	public Student(String name, String age, ArrayList<String> hobbys) {
		super();
		this.name = name;
		this.age = age;		
		this.hobbys = hobbys;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ArrayList<String> getHobbys() {
		return hobbys;
	}

	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}

	
	

}