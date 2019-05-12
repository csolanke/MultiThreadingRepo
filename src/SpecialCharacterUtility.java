import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharacterUtility {
	
	public static void main(String[] args) {
		
	    replceSpecialCharacter("$$$$$hjdg$h&jk8^i0ssh6%%$$$$Chandrakant ** DADA SOlanke");
	}

	private static void replceSpecialCharacter(String c) {
		
        Pattern pt = Pattern.compile("[^a-zA-Z0-9]");
        Matcher match= pt.matcher(c);
        while(match.find())
        {
          String s= match.group();
          
        c=c.replaceAll("\\"+s, "");
        
        }
        
        System.out.println(c);

	}
	
	
	

}
