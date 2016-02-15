/* 
 * University of Central Florida
 * COP3330 - Spring 2016
 * Author: Martin Do
 */

package SentenceUtils;

public class SentenceUtils {
	
	private String sentence;
	private String[] tokens;
	private String[] shings;
	
	
	public SentenceUtils (String s){
		sentence = s;
		generateTokens();
		generateShingles();
	}
	
	private void generateTokens(){
		tokens = new String[sentence.length()-1];
		
		for(int i = 0; i < sentence.length(); i++){
			String[] dummyVariable = sentence.split(" "); 
			tokens = dummyVariable.clone();
		}	
		
	}
	
	private void generateShingles(){
		shings = new String[sentence.length()-1];
		for(int i = 0; i < sentence.length()-1; i++){
			shings[i] = sentence.trim().substring(i, i+2).concat(" "); 
		}
	}
	
	public String getSentence(){
		return sentence;
	}
	
	public String[] getShingles(){
		return shings;
	}
	
	public void report(){
		System.out.println(sentence);
		
		for(int i = 0; i < tokens.length; i++){
			System.out.println(i+ ":" +tokens[i]);
		}
		
		for(int i = 0; i < shings.length; i++){
			System.out.print(shings[i]);
		}
	}
}
