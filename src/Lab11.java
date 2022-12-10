import java.util.Scanner;

public class Lab11 {
	public class LabProgram {
		   public static void main(String[] args) {
		      Scanner scnr = new Scanner(System.in);
		      int[] userValues = new int[20];   // List of integers from input

		      int i, j, number;
		      boolean isPalindrome ;
		      
		      number = scnr.nextInt();
		      for (i = 0; i < number; ++i) {
		         userValues[i] = scnr.nextInt();
		      }
		      
		      isPalindrome = true;
		      j = number - 1;
		      for (i = 0; i < j; ++i, --j) {
		         if (userValues[i] != userValues[j]) {
		            isPalindrome = false;
		            break;
		         }
		      }
		      if (isPalindrome) {
		         System.out.println("yes");
		      }
		      else {
		         System.out.println("no");
		      }
		   }
		}
}
