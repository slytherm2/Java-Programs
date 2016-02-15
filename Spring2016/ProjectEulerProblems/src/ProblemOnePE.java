//Problems come from ProjectEuler.net
//Worked: 12/22/15 solved: 12/22/15

import java.util.ArrayList;
import java.util.Scanner;

public class ProblemOnePE {
	private static int Number = 0;
	private static ArrayList<Integer> numberList = new ArrayList<Integer>();
	
	public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Lets find the sum of a number that are multiples of 3 or 5.");
	System.out.println("For example: If we list all the natural numbers below 10" 
						+"\nthat are multiples of 3 or 5, we get 3, 5, 6 and 9. "
						+ "\nThe sum of these multiples is 23.");
	System.out.println("Input a number below: ");
	Number = Integer.parseInt(userInput.nextLine());
	userInput.close();
	
	System.out.println(populateArrayList());
	}
	
	public static Integer populateArrayList(){
		int sumOfNumbers = 0;
		for(int i = 0; i < Number ; i++){
			if(i%3 == 0 || i%5 == 0){
			numberList.add(i);
			}
		}
		for(Integer number : numberList){
			sumOfNumbers = sumOfNumbers + number;
		}
		return sumOfNumbers;
	}
}

