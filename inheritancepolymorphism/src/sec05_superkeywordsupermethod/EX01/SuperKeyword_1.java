package sec05_superkeywordsupermethod.EX01;
class A{void abc(){System.out.println("A클래스의 abc()");}}
class B extends A{
	void abc(){System.out.println("B클래스의 abc()");}
	void bcd() {abc();}}//this.abc()
public class SuperKeyword_1 {
public static void main(String[] args) {
	B bb=new B();
	bb.bcd();
	
}
}
