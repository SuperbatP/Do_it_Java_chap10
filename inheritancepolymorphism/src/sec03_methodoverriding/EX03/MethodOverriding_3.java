package sec03_methodoverriding.EX03;

class A{
	void print1() {System.out.println("A 클래스 print1");}
	void print2() {System.out.println("A 클래스 print2");}
}

class B extends A{
	@Override
	void print1() {System.out.println("B 클래스 print1");}
void print2(int a) {{System.out.println("B 클래스 print2");}}//오버로딩
}

public class MethodOverriding_3 {
public static void main(String[] args) {
	//A타입-A생성자
	A aa=new A();
	aa.print1();
	aa.print2();
	System.out.println();
	
	//B타입-B생성자
	B bb=new B();
	bb.print1();
	bb.print2();
	bb.print2(3);
	System.out.println();
	
	//A타입-B생성자
	A ab=new B();
	ab.print1();
	ab.print2();
}
}
