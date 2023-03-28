package nubmerseriesprogrames;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value for N= ");
		int n=s.nextInt();
		int sum=0;
		int i=1;
		while(i<n) {
			if(n%i==0) {
				sum=sum+i;
			}
			i++;
		}
		if (n==sum) {
			System.out.println(n+" is a perfect number");
		}
		else
		{
			System.out.println(n+" is not a perfect nubmer");
		}
		
	}

}
