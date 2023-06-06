package sec02_typecasting.EX03;
//캐스팅 가능 여부를 확인 하는 instanceof

class A{}
class B extends A{}


public class Typecasting_3 {
public static void main(String[] args) {
	//instanceof
	A aa=new A();
	A ab=new B();
	
	System.out.println(aa instanceof A);//t
	System.out.println(ab instanceof A);//t
	System.out.println(aa instanceof B);//f
	System.out.println(ab instanceof B);//t
	
	if(aa instanceof B) {
		B b=(B)aa;
		System.out.println("aa를 B로 캐스팅했습니다.");}
	else {System.out.println("aa를 B로 캐스팅 불가능!");}
	
	if(ab instanceof B) {
		B b=(B)ab;
		System.out.println("ab를 B로 캐스팅했습니다.");}
	else {System.out.println("ab를 B로 캐스팅 불가능!");}
	
	if("안녕" instanceof String) {System.out.println("\"안녕\"은 String 클래스입니다.");}
	
}
}
