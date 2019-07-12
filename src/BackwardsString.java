

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public  String funkifyText(String s) {
		String ans = "";
		
		for (int i = s.length()-1; i > -1; i--) {
	
			ans += s.charAt(i);
			
		}
		
		return ans;
	}

}
