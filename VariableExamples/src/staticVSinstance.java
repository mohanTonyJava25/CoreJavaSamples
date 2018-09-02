
public class staticVSinstance {

	int n = 1; // instance variable
	static int k = 1; //static variable

	staticVSinstance() {
		System.out.println(n);
		System.out.println(k);
		System.out.println("inside a constructor");
		n++;
		k++;
		System.out.println("I am instance varaible " +n);
		System.out.println("I am static variable" +k);
	}

	public static void main(String[] args) {

		staticVSinstance SI = new staticVSinstance(); // reference variable SI is referencing the class staticVSinstance
		staticVSinstance SI1 = new staticVSinstance();
		staticVSinstance SI2 = new staticVSinstance();

		System.out.println("this is n value\t" + SI.n);
		System.out.println(" this is k value\t" + SI.k);

	}

}
