package _99_demo.oldschool.p2;

import _99_demo.oldschool.p3.ClassC;

public class ClassB {

	public ClassB() {
	}

	public void methodB() {
		System.out.println("ClassB的methodB()正在執行，此方法會呼叫類別C的methodC()...");
		ClassC objC = new ClassC();
		objC.methodC();
	}
}
