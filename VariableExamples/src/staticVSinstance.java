
public class staticVSinstance {

	int n = 1;
	static int k = 1;
	
	staticVSinstance()
	{
		System.out.println(n);
		System.out.println(k);
		System.out.println("inside a constructor");
		n ++;
		k++;
		System.out.println(n);
		System.out.println(k);
	}
	
	public static void main(String[] args) {

		
		staticVSinstance SI = new staticVSinstance();
		staticVSinstance SI1 = new staticVSinstance();
		staticVSinstance SI2 = new staticVSinstance();
		
		System.out.println( "this is n value\t" +SI.n);
		System.out.println(" this is k value\t" +SI.k);
		
		
	}
	
	
}
