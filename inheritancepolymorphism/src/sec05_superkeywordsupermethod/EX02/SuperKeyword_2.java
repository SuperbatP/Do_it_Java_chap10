package sec05_superkeywordsupermethod.EX02;
class A{void abc(){System.out.println("A클래스의 abc()");}}
class B extends A{
	void abc(){System.out.println("B클래스의 abc()");}
	void bcd(){super.abc();}}//부모클래스의 abc()
public class SuperKeyword_2 {
public static void main(String[] args) {
	B bb=new B();
	bb.bcd();
}
}