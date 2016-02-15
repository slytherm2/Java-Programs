import java.security.SecureRandom; //SecureRandomObj
import java.util.ArrayList; //Array String[] and ArrayList<>
import java.util.List; //List<>


public class PassWordGenerator {
	private static String[] capitalCharactersList = {"A","B","C","D","E","F","G","H"
						,"I","J","K","L","M","N","O","P","Q","R","S","T","U"
						,"V","W","X","Y","Z"};
	private static String[] specialCharactersList = {"!","@","#","$","%","^","&","*","+"
						,"?","~"};
	private List<String> lowerCaseCharactersList = new ArrayList<String>();
	
	private String passWord;
	
	public PassWordGenerator(){
		for(int i=0; i < capitalCharactersList.length; i++){
			lowerCaseCharactersList.add(capitalCharactersList[i].toLowerCase());
		}
		generatingPassWord();
	}
	
	private String generatingPassWord(){
		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i<10; i++){
			if(i==random.nextInt(9)){
				sb.append(capitalCharactersList[random.nextInt(25)]);
			}
			else if(i==random.nextInt(9)){
				sb.append(specialCharactersList[random.nextInt(10)]);
			}
			else if(i==random.nextInt(9)){
				sb.append(random.nextInt(9));
			}
			else{
				sb.append(lowerCaseCharactersList.get(random.nextInt(25)));
			}
		}
		return passWord = sb.toString();
	}

	public String[] getCapitalCharactersList(){
		return capitalCharactersList;
	}

	public String[] getSpecialCharactersList(){
		return specialCharactersList;
	}

	public List<String> getLowerCaseCharactersList(){
		return lowerCaseCharactersList;
	}

	public String getPassWord(){
		return passWord;
	}
}
