package _99_demo.spring.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import _99_demo.spring.anno.p2.ClassB;
//@Component
public class ClassA {
	@Autowired
	ClassB objB;
	
	// 建構子
	public ClassA() {
		
	}
	
	public void m1() {
		
		objB.methodB();
	}
	

}
