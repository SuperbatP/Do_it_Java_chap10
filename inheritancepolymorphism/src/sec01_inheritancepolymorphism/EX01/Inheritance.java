package sec01_inheritancepolymorphism.EX01;
class Human{
String name;
int age;
void eat() {}
void sleep() {}
}//class human end

class Student extends Human{
	int studentID;
	void goToSchool() {}
}//class Student end

class Worker extends Human{
	int workerID;
	void goToWork() {}
}//class Worker end

public class Inheritance {
	public static void main(String[] args) {
		//Human 객체 생성
		Human h = new Human();
		h.name = "김민성";
		h.age = 15;
		h.eat();
		h.sleep();
		
		//Student 객체 생성
		Student s = new Student();
		s.name = "김민성";
		s.age = 15;
		s.studentID=128;
		s.eat();
		s.sleep();
		s.goToSchool();
		
		//worker 객체 생성
		Worker w= new Worker();
		w.name="김현지";
		w.age=30;
		w.workerID=128;
		w.eat();
		w.sleep();
		w.goToWork();
		
	}

}
