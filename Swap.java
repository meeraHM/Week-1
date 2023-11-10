package second;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declear the integer values
					int m = 9, n = 5;

					// Calling above function to
					// reverse the numbers
					swapValuesUsingThirdVariable(m, n);
			}
 // use the swap funtion to swap the numbers
		private static void swapValuesUsingThirdVariable(int m, int n) {
			int temp = m;
			m = n;
			n = temp;
			System.out.println("Value of m is " + m
							+ " and Value of n is " + n);
			//print the result
    }

	}


