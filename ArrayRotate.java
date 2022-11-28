package wiprotalentnext;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayRotate {
	public static void main(String args[]) {
		Scanner inp=new Scanner(System.in);
		
		int f=inp.nextInt();
		
		ArrayList al=new ArrayList();
		
		for(int i=0;i<f;i++) {
			al.add(inp.nextInt());
		}
		
		
		int l=inp.nextInt();
		
		//int i=0;
		
		while(l>0) {
			al.add(al.get(0));
			al.remove(0);
			//i++;
			l--;
		}
		System.out.print(al);
	}
}
