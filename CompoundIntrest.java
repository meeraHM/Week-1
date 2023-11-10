package second;

public class CompoundIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p =1200; //principal amount
		double r =5.4; //the rate of intrest
		double t =2; //the Time span in years 
		
		double CompoundIntrest = p* Math.pow(1+ r /100,  t);
		
		System.out.println("Compound Intrest is : " + CompoundIntrest);
		
		
		

	}

}
