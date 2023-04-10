package nubmerseriesprogrames;

public class Pattern {
	public static void main(String[] args) {
		int n=4;
		int i=1;
		char ch='A';
		for (int row=0; row<n; row++) {
			for(int col=0;col<n;col++) {
				if (row%2==0) {
					System.out.println(ch+"");
				}
					else {
						System.out.println(i+"");
						
				}
			}
			System.out.print("");
		}
	}

}
