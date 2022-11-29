import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What's the size?");
		
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		
		double[] mynum = new double[size];
		
		for (int i = 0; i < mynum.length; i++) {
			System.out.println("Give me a number");
			mynum[i]=in.nextDouble();
		}
		
		Arrays.sort(mynum);
		System.out.println(mynum[0]);
		System.out.println(mynum[mynum.length-1]);
	}
	

}










