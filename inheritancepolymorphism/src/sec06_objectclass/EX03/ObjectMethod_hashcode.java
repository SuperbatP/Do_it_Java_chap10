package sec06_objectclass.EX03;

import java.util.HashMap;

class A {String name;
A(String name){this.name=name;}
@Override
	public boolean equals(Object obj) {
	if(this.name==((A)obj).name) {
		return true;}
	else
		return false;
	}
@Override
	public String toString() {
		return name;
	}
}


class B {String name;
B(String name){this.name=name;}
@Override
	public boolean equals(Object obj) {
	if(this.name==((B)obj).name) {
		return true;}
	else
		return false;
	}
@Override
	public int hashCode() {
		return name.hashCode();
	}





@Override
	public String toString() {
		return name;
	}
}


public class ObjectMethod_hashcode {
public static void main(String[] args) {
	HashMap<Integer, String> hm1=new HashMap<>();
	hm1.put(1, "데이터1");
	hm1.put(1, "데이터2");
	hm1.put(2, "데이터1");
 System.out.println(hm1);//데이터1과 데이터2는 중복키값을 가지므로 출력은 2개의 데이터만 나옴
 
 HashMap<A, String> hm2=new HashMap<>();
	hm2.put(new A("첫번째"), "데이터1");
	hm2.put(new A("첫번째"), "데이터2");
	hm2.put(new A("두번째"), "데이터3");
System.out.println(hm2);//데이터1과 데이터2는 다른 키 값을 가지므로 출력은 3개
 

HashMap<B, String> hm3=new HashMap<>();
hm3.put(new B("첫번째"), "데이터1");
hm3.put(new B("첫번째"), "데이터2");
hm3.put(new B("두번째"), "데이터3");
System.out.println(hm3);//똑같은 문자를 만나면 해시코드를 동일하게 지정함. 출력은 2개
 
}
}
