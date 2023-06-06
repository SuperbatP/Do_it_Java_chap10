package sec04_overlapmember.EX02;
//static field:객체 생성 없이 사용

class A{static int m=3;}
class B extends A{static int n=4;}
public class OverlapStaticField {
public static void main(String[] args) {
	//클래스 명으로 바로 접근
	System.out.println(A.m);
	System.out.println(B.n);
	System.out.println();
	
	//객체생성
	A aa=new A();
	B bb=new B();
	A ab=new B();
	
	//생성한 객체로 정적 필드 호출
	System.out.println(aa.m);
	System.out.println(bb.n);
	System.out.println(ab.m);
//	System.out.println(ab.n);불가능
}
}
