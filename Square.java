package second;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =10;
		double SquareSum = Math.pow((n *(n+1)/ 2.0), 2);
		
		double sumSquare = (n*(n+1)* (2* n+1)/ 6.0);
		
		double difference = SquareSum - sumSquare;
		
		System.out.println("The difference is : " + difference); 
		
		
		

	}

}
