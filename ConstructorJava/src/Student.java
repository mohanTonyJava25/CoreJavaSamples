public class Student {

	int rollnumber;
	String name;
	String Branch;
	
	  Student()
	  {
		  System.out.println("no Parameters");
		  
	  }
	  
	  Student(int x, String y )
	  {
		  rollnumber = x;
		  name = y;
		  System.out.println("2 parameters" +rollnumber +name);
	  }
	
	  
	  Student(String y )
	  {
		  
		  Branch = y;
		  System.out.println("1 parameters" +rollnumber +name +Branch);
	  }
	  
	  Student(int x, String y, String z )
	  {
		  rollnumber = x;
		  name = y;
		  Branch = z;
		  
		  
		  System.out.println("3 parameters" +rollnumber +name +Branch);
	  }
	
}
