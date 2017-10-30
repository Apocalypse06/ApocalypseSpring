package _99_demo.spring.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _99_demo.spring.xml.ClassA;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"\\_99_demo\\spring\\applicationContext.xml");
		ClassA ca = context.getBean(ClassA.class);
		ca.m1();
	}

}
