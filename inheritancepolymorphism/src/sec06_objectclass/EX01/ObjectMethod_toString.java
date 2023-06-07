package sec06_objectclass.EX01;

class A{//extends Object 컴파일러가 자동추가
	int a=3;
	int b=4;
}

class B{
	int a=3;
	int b=4;

	public String toString() {
		return "필드값(a, b)="+ a+" "+b;
	}
}

public class ObjectMethod_toString {
public static void main(String[] args) {
	A a=new A();
	B b=new B();
	
	//메서드호출
	System.out.printf("%x\n",a.hashCode());//hashcode를 16진수로(%X)로 표현 
	System.out.println(a);//toString()메서드는 생략시 자동추가
	System.out.println(b);
}
}
