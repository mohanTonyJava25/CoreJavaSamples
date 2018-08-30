
public class ArrayDemomethod {

	int sum;

	public static void main(String[] args) {

		int[] arr = { 11, 22, 33, 44, 55, 66 };

		ArrayDemomethod arr1 = new ArrayDemomethod();

		arr1.display(arr);
		int total = arr1.display1(arr);
		System.out.println("total\t" + total);

	}

	void display(int[] temp) {
		for (int z : temp) {
			System.out.println(z);
		}

	}

	int display1(int[] temp) {
		for (int k : temp) {
			sum = sum + k;

		}

		return sum;
	}

}
