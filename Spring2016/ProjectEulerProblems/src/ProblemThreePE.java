
//Problems come from ProjectEuler.net
//Worked:1/7/2016  solved: 1/8/2016

//first cycle through the numbers that divide into the chosen number
//check those numbers that divide into the chosen number if it is prime
//add the prime numbers into the list

/*This program works for smaller numbers like the SMALL_CONSTANT but when given 
 * bigger numbers like BIG_CONSTANT the program stalls after the last number 6857. 
 * It wasn't able to complete the program after 6857 and assumed this number would be the answer 
 * to the project euler problem. */

import java.util.ArrayList;

public class ProblemThreePE {
	
	private ArrayList<Double> primeNumber = new ArrayList<Double>();
	private double BIG_CONSTANT = 600851475143.0;
	private double SMALL_CONSTANT = 13195.0;

	public static void main(String[] args){
		ProblemThreePE problemThreePE = new ProblemThreePE();
		
		for(double i = 2.0; i < problemThreePE.SMALL_CONSTANT; i++){
			if(problemThreePE.SMALL_CONSTANT%i == 0){
				if(problemThreePE.isPrime(i)){
					problemThreePE.primeNumber.add(i);
				}
			}
		}
		System.out.println("The largest prime factors for " + problemThreePE.SMALL_CONSTANT +  " are: ");
		problemThreePE.readValues();
	}
	
	//prime number checker method was taken from the Internet
	public Boolean isPrime(double n){
	    if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
		}
	
	public void readValues(){
		System.out.println(primeNumber.get(primeNumber.size()-1));
	}
}

