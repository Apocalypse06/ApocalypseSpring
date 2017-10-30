package _99_demo.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// ClassA ca = new ClassA();
		// ca.m1();

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"\\_99_demo\\spring\\applicationContext.xml");
		ClassA ca = context.getBean(ClassA.class);
		ca.m1();
	}

}
