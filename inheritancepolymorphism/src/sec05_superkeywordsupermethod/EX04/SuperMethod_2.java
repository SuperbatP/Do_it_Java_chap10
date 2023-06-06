package sec05_superkeywordsupermethod.EX04;
class A{
	A(){this(3);
		System.out.println("A 생성자1");}
	A(int a){System.out.println("A 생성자2");}
}
//생성자가 2개라는 건 객체 생성 방법이 2개라는 것
class B extends A{
	B(){//spuer();생략 ->A()
		this(3);
		System.out.println("B 생성자1");}
	B(int b){//spuer();생략 ->A()
		System.out.println("B 생성자2");}
}
public class SuperMethod_2 {
public static void main(String[] args) {
	A aa1=new A(); //A생성자2 A생성자1
	System.out.println();
	A aa2=new A(3);//A생성자2 
	System.out.println();
	B bb1=new B();//A생성자1 A생성자1 B생성자2 B생성자1
	System.out.println();
	B bb2=new B(3);//A생성자1 A생성자2 B생성자2
}}
