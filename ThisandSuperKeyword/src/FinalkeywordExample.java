///*
////Final KeyWord:
////	
////	1.) when a variable is declared with final keyword, its value can't be 
////        modified, essentially, a constant. 
////    2.) Final is keyword which can be applied to variables, mwthods and classed 
////    3.) when a class is declared with final keyword, it is called a final class. s finaal class cannot be extended( inherited).
////    4.) When a method is declared with final keyword, it is called a final Method.class a final method cannot be overridden
////	  5.) you can assign final to any variable like instance, local or static. 

//class FinalkeywordExample extends FinalDemo


public class FinalkeywordExample extends FinalMethodDemo {

	public static void main(String[] args) {

		final int i = 100;

		/* i = i + 5;  can't possible because it is Final i = i+5;
*/
		System.out.println(i);
		
		FinalDemo Demo = new FinalDemo();
		
		FinalMethodDemo fm = new FinalMethodDemo();
		
		/* void demo()
		{
			System.out.println("I cant override final method");
		}*/
		
		
		Demo.display();
	}

}
