package sec03_methodoverriding.EX01;

class A{
	void print() {System.out.println("A 클래스");}
}

class B extends A{
	void print() {System.out.println("B 클래스");}
}

public class MethodOverriding_1 {
public static void main(String[] args) {
	//A타입-A생성자
	A aa=new A();
	aa.print();//A클래스
	
	//B타입-B생성자
	B bb=new B();
	bb.print();//B클래스
	
	//A타입-B생성자
	A ab=new B();
	ab.print();//B클래스
	
}
}
