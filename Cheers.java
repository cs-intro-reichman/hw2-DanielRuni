// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
        String lettersToCheck = "AEFHILMNORSX";
        int sw = 0;
        int times = Integer.parseInt (args[1]);
        word = word.toUpperCase();
        for (int i=0; i<word.length(); i++)
        {
            if (lettersToCheck.indexOf(word.charAt(i)) != -1) {
                System.out.println("Give me an " + word.charAt(i) + ": " + word.charAt(i) + "!");
            } else {
                System.out.println("Give me a  " + word.charAt(i) + ": " + word.charAt(i) + "!");
            }
        }
        System.out.println("What does that spell?");
        for (int j=0; j<times; j++) {
            System.out.println(word + "!!!");
        }
    }
    
}
