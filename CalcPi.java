// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int denominator = 3;
		double sum = 1;
		int number = Integer.parseInt (args[0]);
		number --;
			for ( int i=0; i<number/2; i++) {
				sum -= ((double) 1 / denominator);
				denominator += 2;
				sum += ((double) 1 / denominator);
				denominator += 2;
			}
			if 
			(number % 2 != 0) {
				sum -= ((double) 1 / denominator);
			}
	System.out.println("pi according to Java: " + Math.PI);
	System.out.println("pi, approximated:     " + sum * 4);
	}
}
