package wiprotalentnext;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Stringrev_wordwise {
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		
		String s=inp.nextLine();
		
		ArrayList al=new ArrayList();
		
		StringTokenizer st=new StringTokenizer(s," ");
		
		while(st.hasMoreTokens()) {
			al.add(st.nextToken());
		}
		
		for(int i=al.size()-1;i>=0;i--) {
			System.out.print(al.get(i)+" ");
		}
	}
}
