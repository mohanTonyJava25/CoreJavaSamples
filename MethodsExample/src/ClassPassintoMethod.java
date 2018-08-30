
public class ClassPassintoMethod {

	public static void main(String[] args) {

		Student tom = new Student();
		student1 tony = new student1();
		ClassPassintoMethod clas = new ClassPassintoMethod();

		clas.display(tom);
	int total =	clas.display1(tony);
	System.out.println(+total);
		
	}

	void display(Student s2) {
		System.out.println(s2.math);
		System.out.println(s2.social);

	}
	
	int display1(student1 s2)
	{
		int sum = s2.eng+s2.hindi+s2.math+s2.science+s2.social;
		
		return sum;
	}

}
