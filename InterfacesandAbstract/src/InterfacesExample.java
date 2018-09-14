/*
Abstraction : 
	
	1.) Abstraction is aa process of hiding the implementation details from the user . only functionality will be provided to the user
    2.) In java, abstraction is achireved using abstract class and interfaces. 

	

abstraction class 0-100% hiding where as Interface is 100% complete hiding. 

Interfaces: 
	
	1.)  Interface is a collection of abstract methods. 
	
    2.) An interface can contain both variables and methods. 
    3.) an interfaces can not be instantiated. 
    4.) in order to access the members of interface we need to inherit the interface into a class using implemtents key word.
    5.) in the sub class we have to override all the abstract methods. 
 6.) if the sub class is overriding all the methods of the interface then it is called as implemtation class
 7.) a class can implement any number of interfaces. 
 
 Class -----> class ----> extends (single class)
 class -----> interface ---> implements  ( any number)
 interface ---> interface ---> extends (anynum)

*/

interface InterfacesExample {

	int i = 10; // by default JVM says it is static final

	public abstract void name();

	public abstract void math();

	public abstract void phsyics();

	public abstract void social();

	public abstract void science();

}
