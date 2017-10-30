package _99_demo.spring.anno.p2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import _99_demo.spring.anno.p3.ClassC;

@Component
public class ClassB {
	@Autowired
	ClassC objC;

	public ClassB() {
	}

	public void methodB() {
		System.out.println("ClassB的methodB()正在執行，此方法會呼叫類別C的methodC()...");
		
		objC.methodC();
	}
}
