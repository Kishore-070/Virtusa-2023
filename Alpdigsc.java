package wiprotalentnext;
import java.util.Scanner;

public class Alpdigsc {

	public static void main(String[] args) {
		System.out.println("Enter :");
		Scanner inp=new Scanner(System.in);
		char a=inp.next().charAt(0);
		 if((a>='a' && a<='z')||(a>='A' && a<='Z')) {
			 System.out.println("Alphabet");
		 }else if(a>='0' && a<='9') {
			 System.out.println("Digit");
		 }else {
			 System.out.println("Special Character");
		 }

	}

}
