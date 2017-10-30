package _99_demo.spring.p4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import _99_demo.spring.anno.p2.ClassB;
@Component
public class ClassA implements IClassA {
	@Autowired
	ClassB objB;
	static {System.out.println("123");}
	
	// 建構子
	public ClassA() {
		
	}
	
	/* (non-Javadoc)
	 * @see _99_demo.spring.p4.IClassA#m1()
	 */
	@Override
	public void m1() {
		
		objB.methodB();
	}
	

}
