package nubmerseriesprogrames;

import java.util.Scanner;

public class SunnyNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the vlaue for N =");
		int n=s.nextInt();
		int a=n+1;
		int i=1;
		int count=0;
		while(i<a) {
			if(i*i==a) {
				count++;
				break;
				}
			i++;
		}
		if(count==1) {
			System.out.println(n+" is a sunny number");
		}
		else
		{
			System.out.println(n+" is not a sunny number");
		}
	}

}
