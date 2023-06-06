package sec03_methodoverriding.EX04;
class A{protected void abc(){}}//접근지정자 protected 

class B1 extends A{public void abc(){} //오버라이딩시에 접근지정자는 같더나 커야한다.
}
class B2 extends A{protected void abc(){}
}
class B3 extends A{//void abc(){}//default 접근지정자->불가능
}
class B4 extends A{//private void abc(){}->불가능
}


public class MethodOverriding_4 {
public static void main(String[] args) {
	
}
}
