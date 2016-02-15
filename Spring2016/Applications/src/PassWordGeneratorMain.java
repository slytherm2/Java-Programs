import static java.lang.Math.toIntExact;

public class PassWordGeneratorMain {
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		System.out.println("This is a password generator that will " 
				+ "generate a password that will have the following attributes:"
				+System.getProperty("line.separator")
				+ "\"One Capital Letter, One Special Character,"
				+ "and at least one number. \"");
		System.out.println();
		System.out.println("We will be creating a 10-digit password.");
		System.out.println("We are in the process of creating your password...");
		 
		PassWordGenerator passWordGenerator = new PassWordGenerator();
		System.out.println("Your new password is... " +passWordGenerator.getPassWord());
		long endTime = System.currentTimeMillis();
		int totalTime = toIntExact((endTime-startTime));
		System.out.println("Total time in (ms): "+totalTime);
	}	
}
