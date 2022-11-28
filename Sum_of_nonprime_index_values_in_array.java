package wiprotalentnext;

import java.util.Scanner;

public class Sum_of_nonprime_index_values_in_array {
	public static void main(String args[]) {
	Scanner inp=new Scanner(System.in);
	
	int n=inp.nextInt();
	
	int arr[]=new int[n];
	
	for(int i=0;i<n;i++) {
		arr[i]=inp.nextInt();
	}
	int sum=0;
	for(int j=0;j<n;j++) {
		int count=0;
		if(j==0 || j==1) {
			System.out.println(arr[j]);
			sum+=arr[j];
		}else {
		for(int k=2;k<j;k++) {
			if(j%k==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println(arr[j]);
			sum+=arr[j];
		}
		}
	}
	System.out.print(sum);
	
	}
}


