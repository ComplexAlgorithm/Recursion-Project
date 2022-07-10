
public class RecursiveFactorial {
		public static void main(String[] args) {
			int result = factorial(4); //4! = 4 * 3 * 2 * 1 
			System.out.println("Factorial is: " + result);
			System.out.println("This is the end of the program!");
		}
			
		//recursive not using a loop 
		public static int factorial(int number) {
			if(number <= 1) {
				return 1;
			}
			else {
				return number * factorial(number-1);
			}
		}

	}

