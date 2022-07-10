
public class IterativeExample {

	public static void main(String[] args) {
		countDown(4);
		System.out.println("End of program!");
	}

	//prints the all the numbers between num and 0, num must be greater than 0 or this method does not print anything
	//3, 3, 2, 1 
	//4, 4, 3, 2, 1
	public static void countDown(int num) {
		for(; num > 0; num--) {
			System.out.println(num);
		}
	}
}

	
