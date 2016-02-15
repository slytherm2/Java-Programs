import java.util.ArrayList;

//Problems come from ProjectEuler.net
//Worked: 12/22/15 solved: 12/22/15


public class ProblemTwoPE {
	private static int CONST_VALUE = 4000000; 
	private static ArrayList<Integer> arrayList = new ArrayList<Integer>();
	private static ArrayList<Integer> dummyList = new ArrayList<Integer>();
	
	public static void main(String[] args){
		
		System.out.println("Using the Fibonacci sequence, we will add the even terms"
				+" up until 4,000,000.");
		System.out.println("The sum of even numbers in the Fibonacci sequence is: " +addingEvenFibonacci());
	}
	
	public static Integer addingEvenFibonacci(){
		dummyList.add(1);
		dummyList.add(1);
		int someValue = 0;
		int sumOfFibo = 0;
		int i = 1;
		
		while(someValue < CONST_VALUE){
			someValue = dummyList.get(i) + dummyList.get(i-1);
			dummyList.add(someValue);
				if(someValue%2 == 0){
					arrayList.add(someValue);
				}
			i++;
		}
		for(Integer numbers : arrayList){
			sumOfFibo = sumOfFibo + numbers;
		}
		return sumOfFibo;
	}
}
