package program4;
public class repeatString{

public String repeatString(String str, int n) {
		
		  int len = str.length();
		  String newString = "";
		  
		  for (int i = n; n > 0; n--){
		    newString += str.substring(0,n);
		  }
		  
		  return newString;
		}

	public static void main(String[] args) {
		
		repeatString rs = new repeatString();
		System.out.println(rs.repeatString("Chocolate", 4));
	}
}
