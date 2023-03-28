package nubmerseriesprogrames;

import java.util.Scanner;

public class NeonNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value for n=");
	int n=s.nextInt();
	int sq=n*n;
	int sum=0;
	while (sq>0) {
		int rem=sq%10;
		sum=sum+rem;
		sq=sq/10;
	}
	if (sum==n) {
		System.out.println(n+" is a Neon number");
	}
	else
	{
		System.out.println(n+" is not a Neon number");
	}
}

}
