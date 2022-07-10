
public class NonRecursiveFactorial {
	public static void main(String[] args) {
		int result = factorial(4); //4! = 4 * 3 * 2 * 1 
		System.out.println("Factorial is: " + result);
		System.out.println("This is the end of the program!");
	}
	
	//iterative version using a loop
	public static int factorial(int number) {
		int answer = 1;
		for(; number >= 1; number--) {
			answer = number * answer;
		}
		return answer;
	}

}

