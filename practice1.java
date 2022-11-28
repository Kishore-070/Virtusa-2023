package wiprotalentnext;

import java.util.*;


class practice1{
	public static void main(String args[]) {
	 Scanner inp=new Scanner(System.in);
	 
	 int n=inp.nextInt();
	 int sum=0;
	 
	 
	 String l=String.valueOf(n);
	 
	 int ii=l.length()-1;
	 
	 int al[]=new int[l.length()];
	 
	 while(n!=0) {
		int s=n%10;
		 al[ii]=s;
		 n=n/10;
		 ii--;
	 }
	 for(int i=0;i<al.length;i++) {
		 
		 for(int j=i;j<al.length;j++) {
			 sum+=al[j];
		 }
	 }
	 System.out.print(sum);
	 
	 
	 
}
}
