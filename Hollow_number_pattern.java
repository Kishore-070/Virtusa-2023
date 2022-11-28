package wiprotalentnext;

import java.util.Scanner;

public class Hollow_number_pattern {
	public static void main(String args[]) {
		Scanner inp=new Scanner(System.in);
		int n=inp.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0) {
					System.out.print(j+1);
				}else if(j==0) {
					System.out.print(i+1);
				}else if(j==n-1) {
					System.out.print(n-i);
				}else if(i==n-1) {
					System.out.print(n-j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}	

}
