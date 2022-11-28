package wiprotalentnext;
import java.util.Scanner;

public class Condition {
public static void main(String[] args) {
	int n;
	Scanner in =new Scanner(System.in);
	n=in.nextInt();
	if(n>0) {
		System.out.println("Positive");
	}else if(n<0) {
		System.out.println("Negative");
	}else {
		System.out.println("Zero");
	}
}
}
