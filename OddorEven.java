package wiprotalentnext;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		System.out.print("Enter the number : ");
	      Scanner inp =new Scanner(System.in);
	      int input= inp.nextInt();
	      if(input%2==0) {
	    	  System.out.println("Even Number");
	      }else {
	    	  System.out.println("Odd Number");
	      }

	}

}
