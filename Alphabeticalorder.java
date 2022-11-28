package wiprotalentnext;

import java.util.Scanner;

public class Alphabeticalorder {

	public static void main(String[] args) {
		char a;
		char b;
		Scanner inp=new Scanner(System.in);
		a=inp.next().charAt(0);
        b=inp.next().charAt(0);
        if(a>b) {
        	System.out.println(b);
        	System.out.println(a);
        }else {
        	System.out.println(a);
        	System.out.println(b);
        }
        
	}

}
