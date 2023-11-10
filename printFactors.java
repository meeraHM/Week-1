package second;

public class printFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declear the number 
        int n = 24;

        // display the  factors
        System.out.print("Factors of " + n + ": ");
        
        // Loop to find and display factors
        for (int i = 1; i <= n; i++) {
            // Check if i is a factor of the given number
            if (n % i == 0) {
                // display the factor
                System.out.print(i + " ");
            }

	}

}}
