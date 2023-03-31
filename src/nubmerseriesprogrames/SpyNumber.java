package nubmerseriesprogrames;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the value for N=");
		int n=S.nextInt();
		int temp=n;
		int sum=0;
		int prod=1;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem;
			prod=prod*rem;
			n=n/10;
		}
		if(sum==prod) {
			System.out.println(temp+" is a spy number");
		}
		else {
			System.out.println(temp+" is not a spy nubmer");
		}
	}

}
