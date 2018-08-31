//
//Constrctor information : 
//	
//	1.) it is a special type of method.
//    2.) it is used to isnitialize an instance.
//    3.) Name must be same as class name
//    4.) it can not contain return type
//    5.) it will execute during object creation time
//    6.) it will execute one time for every object creation . 
//    7.) it can contian any number of parameters
//      i.) zero param ii.) param
//     8.) A class can contain any number of constructors.  

public class constructorClass {

	constructorClass() // zero parameterized constructor
	{
		System.out
				.println("babu, I am constructor. I will run everytime once you use the new key word forr that class");
	}

	constructorClass(String s, int i) // parameterized constructor
	{
		System.out.println(
				"babu, I paramaterized am constructor. I will run everytime once you use the new key word forr that class"
						+ s + i);
	}

	public static void main(String[] args) {

		System.out.println("constructor");

		constructorClass CC = new constructorClass();

		constructorClass CC1 = new constructorClass();

		constructorClass CC2 = new constructorClass();
		constructorClass CC3 = new constructorClass("mohan", 22);
		ConstructorExample CC4 = new ConstructorExample();

		CC4.example();
		Student s = new Student(55, "anurag");
		Student s1 = new Student(54, "Mohan");
		Student s2 = new Student("CSE");
		Student s3 = new Student(66, "Mohan", "cse");
		
		
		

	}

}
