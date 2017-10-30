package _99_demo.spring.xml;

import _99_demo.spring.xml.p2.ClassB;

public class ClassA {
	ClassB objB;
	public void setObjB(ClassB objB) {
		this.objB = objB;
	}
	
	public ClassA(ClassB objB) {
		super();
		this.objB = objB;
	}

	// 建構子
	public ClassA() {
		
	}
	
	public void m1() {
//		ClassB objB = new ClassB();
		objB.methodB();
	}
	

}
