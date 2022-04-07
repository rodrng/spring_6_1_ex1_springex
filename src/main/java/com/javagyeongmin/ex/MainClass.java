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
		
		System.out.println(student1.getName()); // ȫ�浿
		System.out.println(student1.getAge()); // ȫ�浿 ����
		System.out.println(student1.getHobbys()); // ȫ�浿 ���
		
		StudentInfo studentInfo1 = ctx.getBean("studentInfo1",StudentInfo.class);
		Student studentHong =  studentInfo1.getStudent(); // student1 ��ü�� ����
		
		System.out.println(studentHong.getName()); // ȫ�浿
		
		if(student1.equals(studentHong)) {
			System.out.println("student1�� studentHong ��ü�� ���� ��ü�Դϴ�");
		}
		
		Student student2 = ctx.getBean("student2",Student.class);
		
		System.out.println(student2.getName()); // �̼���
		System.out.println(student2.getAge()); // �̼��� ����
		System.out.println(student2.getHobbys()); // �̼��� ���
		
		Family fam = ctx.getBean("family",Family.class);
		System.out.println(fam.getFather()); // ���žƹ���
		System.out.println(fam.getMother()); // ���ž���
		System.out.println(fam.getSister()); // ���ſ�����
		System.out.println(fam.getBrother()); // ���ų�����
		
		ctx.close();
	}

}