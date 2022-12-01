import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What's the size?");
		
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		double sum = 0;
		double[] mynum = new double[size];
		double avg;
		for (int i = 0; i < mynum.length; i++) {
			System.out.println("Give me a number");
			mynum[i]=in.nextDouble();
		}
		
		
		Arrays.sort(mynum);
		System.out.println(mynum[0]);
		System.out.println(mynum[mynum.length-1]);
		for (int i = 0; i < mynum.length; i++) {
			sum = sum + mynum[i];
		 avg = sum/mynum.length;
	System.out.println("the average is: "+avg);
		}
		
		
		//read in a number
		System.out.println("Give me a number");
		int num1 = in.nextInt();
		int num2= num1;
		//subtract 1
		num2 = num2-1;
		//multiply by 3
		num2=num2*3;
		System.out.println(num2);
	}
		
		
	

}










