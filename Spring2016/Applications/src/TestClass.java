import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class TestClass {

	public static void main(String[] args) throws FileNotFoundException {
		strings();
		
		File file = new File("someText.txt");
		Scanner scanner = new Scanner(new FileInputStream(file));

	}
	
	public static void multiples(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input two integers:");
		int value = input.nextInt();
		int value2 = input.nextInt();
		
		if(value2%value == 0){
			System.out.println("The two numbers you have inputed are multiples of each other.");
		}
		else{
			System.out.println("The two numbers you have inputed are NOT multiples of each other");
		}
	}
	
	public static void strings(){
		String s = "abcde";
		int len = s.length();
		String t="";
		for(int i= 0; i<len;i++){
			char c = s.charAt(i);
			t=c+t;
		}
		System.out.println("t= " +t);
	}

}
