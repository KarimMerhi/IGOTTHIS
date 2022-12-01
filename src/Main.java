import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What's the size ? please answer and thanks civilian.");
		
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		double sum = 0;
		double[] mynum = new double[size];
		double Avg = 0.0 , Sum = 0.0;
		
		
		for (int i = 0; i < mynum.length; i++) {
			System.out.println("Give me a number. Sorry if i sound rude my fellow Canadian");
			mynum[i]=in.nextDouble();
			
				Sum = Sum + mynum[i];
				Avg = Sum / mynum.length;	}	
		
		
		
		Arrays.sort(mynum);
		System.out.println(mynum[0]);
		System.out.println(mynum[mynum.length-1]);
		System.out.println("the average is: " + Avg);
	     System.out.println("pardon can you give me a number? please and thank you :).");
          int newnum = in.nextInt();
		
          for (int i = 0; i < newnum; i++) {
			
		}
	newnum = newnum -1;
	System.out.println(newnum);
	newnum = newnum*3;
	System.out.println(newnum);
	newnum = newnum + 12;
	System.out.println(newnum);
	newnum = newnum /3;
	System.out.println(newnum);
	newnum = newnum + 5;
	System.out.println(newnum);
	newnum = newnum - newnum + 8;
	System.out.println(newnum);
	
//Variables exercise
	System.out.println("Whats the number sir?");
	newnum = in.nextInt();
	System.out.println("Are you sure?");
	double dblNum = in.nextDouble();
	in.nextLine();
	System.out.println("Can you please give me a word then?");
	String Word=in.nextLine();
	System.out.println(Word.toUpperCase());
	
	//make the double into a integer by rounding
	//change the string to uppercase
	
	//print the first 3 letters
	
	//then print the rest

	
	
	
	
	//Subprogram
	//make a static method that takes 1 of 2 strings that the user inputs

	
	
	
	
	
	
	
	//Nested exercise
//make a array of numbers horzentally
	//make a array of numbers vertically 
//organize the values in a way where the first number in the horizental array gets multiplied with the values in the verical array and place the new vertical values get placed under the horizental value that is multiplied with it
	//repeat the process until the end of the horizental values using a for loop

//Selection exercise 
// ask the user for their income but don't blackmail them with it you nice guy
//if their income is only 49,020$ yearly multiply 49,020 by 0.15
//if their income is 98040 till 147060 take 1 49020 section and multiply it with 0.15 and the other 49020 multiply it with 0.205
//repeat until we reach 



	}

	private static String upper() {
		// TODO Auto-generated method stub
		return null;
	}

}










