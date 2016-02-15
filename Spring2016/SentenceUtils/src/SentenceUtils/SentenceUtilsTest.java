/* 
 * University of Central Florida
 * COP3330 - Spring 2016
 * Author: Martin Do
 */

package SentenceUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SentenceUtilsTest {
	
	private static List<SentenceUtils> slist = new ArrayList<SentenceUtils>();
	private static int counter = 0;

	public static void main(String[] args) {
		
		try {
				//takes in the file in the program argument
	           File file = new File(args[0]);
	           
	           	//streams the values from the cosmic file 
	           Scanner scanner = new Scanner (new FileInputStream(file));
	           
	           /*
	            * cycles through each line of the cosmic file
	            * assign the vales to sent variable
	            * checks if the line has a value, if so adds it to the array list
	            */
	           while(scanner.hasNextLine()){
	               String sent = scanner.nextLine();
	               if(sent.trim().length()>0){
	                   SentenceUtils sutil = new SentenceUtils(sent);
	                   slist.add(sutil);
	                  }
	           }
	           
	           	System.out.println("Sentence Utility Tester by Martin Do \n");
	           	System.out.println("File that was read: " +file);
	           	System.out.println("The file contains " +slist.size()+ " sentences");
	   			System.out.print("\nSentence reports: ");
		
	   			for(SentenceUtils message : slist){
	   				System.out.println("\n\nSentence " +counter+";");
	   				message.report();
	   				counter++;
	   				}
		}
	    catch( FileNotFoundException e){
	        e.printStackTrace();
	    }    
	  }   
	}