/* 
 * University of Central Florida
 * COP3330 - Spring 2016
 * Author: Martin Do
 */

package jaccard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Jaccard {

	List<SentenceUtils> sents;
	List<Set<String>> shingleSets;
	Set<String> shingles;
	double x;
	
	public Jaccard (List<SentenceUtils> list){
		sents = list;
		generateShingleSets();
	}
	
	private void generateShingleSets(){
		shingleSets = new ArrayList<Set<String>>();
		for(SentenceUtils sents:sents){
			String[] sentsArray = sents.getShingles();
			shingles = new HashSet<String>();
			for(String string:sentsArray){
				shingles.add(string);
			}
			shingleSets.add(shingles);
		}
	}
	
	private double computeJaccard( Set<String> a, Set<String> b){
		
		return x/(a.size()+b.size()-x);
		
	}
	
	public void showSentenceStats(){
		for(int i = 0; i < sents.size(); i++){
			System.out.println("Sentence " +i+ ":");
			System.out.println("\t"+sents.get(i).getSentence());
			System.out.println("\ttotal shingles:"+sents.get(i).getShingles().length);
			System.out.println("\tunqiue shingles:" +shingleSets.get(i).size()+"\n");
		}
	}
	
	public void showSimilarities(){
		System.out.println("Jaccard Similarity Matrix:");
		
		for(int i = 0; i<sents.size();i++){
			for(int j = 0; j<sents.size();j++){
				Set<String> dummyListA = shingleSets.get(i);
				Set<String> dummyListB = shingleSets.get(j);
				x=0;
				
				for(String stringA:dummyListA){
					for(String stringB:dummyListB){
						if(stringA.equals(stringB)){
							x++;
						}
					}
				}
				System.out.printf("%.4f ",computeJaccard(dummyListA,dummyListB));
			}
			System.out.println("\n");
		}
	}
}
