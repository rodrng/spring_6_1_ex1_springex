package com.javagyeongmin.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String configLocation1 = "classpath:applicationCTX.xml";
		String configLocation2 = "classpath:applicationCTX1.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation1,configLocation2);
		
		Student student1 = ctx.getBean("student1",Student.class);
		
		System.out.println(student1.getName()); // 홍길동
		System.out.println(student1.getAge()); // 홍길동 나이
		System.out.println(student1.getHobbys()); // 홍길동 취미
		
		StudentInfo studentInfo1 = ctx.getBean("studentInfo1",StudentInfo.class);
		Student studentHong =  studentInfo1.getStudent(); // student1 객체와 동일
		
		System.out.println(studentHong.getName()); // 홍길동
		
		if(student1.equals(studentHong)) {
			System.out.println("student1과 studentHong 객체는 같은 객체입니다");
		}
		
		Student student2 = ctx.getBean("student2",Student.class);
		
		System.out.println(student2.getName()); // 이순신
		System.out.println(student2.getAge()); // 이순신 나이
		System.out.println(student2.getHobbys()); // 이순신 취미
		
		Family fam = ctx.getBean("family",Family.class);
		System.out.println(fam.getFather()); // 순신아버지
		System.out.println(fam.getMother()); // 순신엄마
		System.out.println(fam.getSister()); // 순신여동생
		System.out.println(fam.getBrother()); // 순신남동생
		
		ctx.close();
	}

}