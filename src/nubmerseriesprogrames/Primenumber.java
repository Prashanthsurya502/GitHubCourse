package nubmerseriesprogrames;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the vlaue for N=");
		int n=s.nextInt();
		int i=2;
		int count=0;
		while(i<n/2) {
			if(n%i==0) {
				count++;
				break;
			}
			i++;
		}
		if (count==1) {
			System.out.println(n+" is  not a prime nubmer");
		}
		else
		{
			System.out.println(n+" is a prime number");
		}
	}

}
