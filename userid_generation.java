package wiprotalentnext;

import java.util.Scanner;

public class userid_generation {
	public static void main(String args[]) {
		 Scanner inp=new Scanner(System.in);
		 
		 String s1=inp.nextLine();
		 String s2=inp.nextLine();
		 int pin=inp.nextInt();
		 int n=inp.nextInt();
		 
		 String usere="";
		 
		 String small="";
		 String large="";
		 
		 if(s1.length()<s2.length()) {
			 small+=s1;
			 large+=s2;
		 }else if(s1.length()>s2.length()) {
			 small+=s2;
			 large+=s1;
		 }else {
			 for(int i=0;i<s1.length();i++) {
				 if(s1.charAt(i)<s2.charAt(i)) {
					 small+=s1;
					 large+=s2;
					 break;
				 }else if(s1.charAt(i)>s2.charAt(i)) {
					 small+=s2;
					 large+=s1;
					 break;
				 }
			 }
		 }
		 String pinn=String.valueOf(pin);
		
		 usere+=small.charAt(0)+large+pinn.charAt(n-1)+pinn.charAt(pinn.length()-(n));
		 
		 StringBuffer user=new StringBuffer(usere);
		 
		 
		 for(int i=0;i<user.length();i++) {
			 if(Character.isUpperCase(user.charAt(i))) {
				 //char s6=user.charAt(i);
				 //char s7=Character.toLowerCase(user.charAt(i));
				 user.setCharAt(i,Character.toLowerCase(user.charAt(i)) );
			 }else if(Character.isLowerCase(user.charAt(i))) {
				 //char s9=user.charAt(i);
				 //char s8=Character.toUpperCase(user.charAt(i));
				 user.setCharAt(i, Character.toUpperCase(user.charAt(i)));
			 }
		 }
		 
		 
		 System.out.print(user);
		 
		 
}

}
