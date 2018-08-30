
public class ClassPassintoMethod {

	public static void main(String[] args) {

		Student tom = new Student();
		ClassPassintoMethod clas = new ClassPassintoMethod();

		clas.display(tom);

	}

	void display(Student s2) {
		System.out.println(s2.math);
		System.out.println(s2.social);

	}

}
