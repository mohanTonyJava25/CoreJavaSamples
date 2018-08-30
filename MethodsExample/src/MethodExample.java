
public class MethodExample {

	void sample() // void method with no parameters, so no return value
	{
		int i = 1;
		int j = 2;
		int k = i + j;

		System.out.println("this is method with no parameters and void method so no return type \t" + k);

	}

	int sample1() // integer method with return value.
	{
		int i = 2;
		int j = 3;
		int k = i + j;
		System.out.println("this is method with no parameters and int method so int return type \t" + k);
		return k;

	}

	void sample(int i, int j) // void method with 2 parameters
	{
		int k = i + j;
		System.out.println("this is void method with two parameters \t" + k);
	}

	int sample1(int i, int j) // int method with 2 parameters
	{
		int k = i + j;
		System.out.println("this is int method with two parameters \t" + k);
		return k;
	}

	public static void main(String[] args) {
		System.out.println();
		MethodExample m1 = new MethodExample();
		m1.sample();
		double test = m1.sample1();
		System.out.println("value from integer method \t" + test);
		m1.sample(5, 6);
		double k = m1.sample1(5, 6);
		System.out.println("value of integer method with 2 parameters \t" + k);
	}

}
