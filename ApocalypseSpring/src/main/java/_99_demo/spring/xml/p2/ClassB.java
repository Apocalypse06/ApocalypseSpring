package _99_demo.spring.xml.p2;

import _99_demo.spring.xml.p3.ClassC;

public class ClassB {
	ClassC objC;
	public ClassB(ClassC objC) {
		super();
		this.objC = objC;
	}

	public void setObjC(ClassC objC) {
		this.objC = objC;
	}

	public ClassB() {
	}

	public void methodB() {
		System.out.println("ClassB的methodB()正在執行，此方法會呼叫類別C的methodC()...");
//		ClassC objC = new ClassC();
		objC.methodC();
	}
}
