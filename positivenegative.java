package wiprotalentnext;
import java.util.Scanner;

public class positivenegative {

	public static void main(String[] args) {
		System.out.print("Enter the number : ");
	      Scanner inp =new Scanner(System.in);
	      int input= inp.nextInt();
	      if(input>0) {
	    	  System.out.println("Positive Number");
	      }else if(input<0) {
	    	  System.out.println("Negative Number");
	      }else {
	    	  System.out.println("Zero");
	      }

	}

}
