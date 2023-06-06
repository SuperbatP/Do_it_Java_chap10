package sec05_superkeywordsupermethod.EX03;

class A{A(){System.out.println("A생성자");}}
class B extends A{
	B(){super();//생략해도 자동으로 컴파일이 추가해줘서 동일한 결과물
	System.out.println("B생성자");}}
/*
 * class C{C(int a){System.out.println("C생성자");}} class D extends
 * C{D(){super(3);}}
 */

public class SuperMethod_1 {
public static void main(String[] args) {
	A aa=new A();
	System.out.println();
	B bb=new B();
}
}
