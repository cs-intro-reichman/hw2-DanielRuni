// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N  = Integer.parseInt (args[0]);
		String mode = args[1];
		int countSteps = 1;
		for (int i=1; i<=N; i++) {
			int number = i;
			if (number == 1) {
				if (mode.charAt(0) == 'v') {
					System.out.print(number + " "); }
				number = number * 3 + 1;
				countSteps ++ ;
			}
			while (number != 1) {
				countSteps ++ ;
				if (number % 2 == 0) {
					if (mode.charAt(0) == 'v') {
						System.out.print(number + " "); }
					number = number / 2;
				} else {
					if (mode.charAt(0) == 'v') {
						System.out.print(number + " ");
					}
					number = number * 3 + 1;
				}
			}
			if (mode.charAt(0) == 'v') {
				System.out.println(number + " (" + countSteps + ")");
			}
			countSteps = 1;
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
