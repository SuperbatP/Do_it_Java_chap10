package sec02_typecasting.EX01;
//클래스의 상속 관계
class A{}
class B extends A {}
class C extends B {}
class D extends B {}
public class Typecasting_1 {
public static void main(String[] args) {
	//업캐스팅(자동변환)
	A ac=new C();//C->A up
	B bc=new C();//C-B up
	
	B bb=new B();
	A a = bb;//B->A up
	
	//다운캐스팅(수동변환)-불가능한 경우
	A aa=new A();
//	B b= aa;//A->B 불가능 실행시 오류
//	C c= aa;//A->B 불가능 실행시 오류
	
	//다운캐스팅(수동변환)-가능한 경우
		A ab=new B();//B까지만 다운캐스팅 가능
		B b= (B)ab;//A->B 가능
//		C c= (C)ab;//A->C 불가능

		B bd = new D();//D까지 다운캐스팅 가능
		D d = (D)bd;//B->D down
		A ad = new D();//D까지 다운캐스팅 가능
		B b1 = (B)ad;//A->B down
		D d1 = (D)ad;//A->D down
}
}
