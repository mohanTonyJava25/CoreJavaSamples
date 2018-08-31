
//this keyword:
//	
//	1.) This keyword refers to current instance of a class
//    2.) using this keyword we can access instance members[variables & members]
//    3.) specifying this keyword is sometimes optional and sometimes mandatory 		
//
//optional: 
//	     to avoid confusion between local variable and instance variable then sepcifying this 
//         keyword is 
//	
//Mandatory: 
//	        to avoid confusion between local variable and instance variable then sepcifying this 
//          keyword is mandatory 

// for example your friend came to your home with same name so your dad called your name so to avoid the confusion you can find your nick name 
//
//
//


public class ThisKeyword {
	
	int person = 10;
    ThisKeyword()
    {
    	int person = 22;
    	
    	System.out.println(person);
    	System.out.println(this.person);
    	
    }
	
    public static void main(String[] args) {
	  ThisKeyword  TK= new ThisKeyword();
	 
	  
	}
    

}
