

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String ans = "";
		
		for(int i = 1; i<s.length();i+=2) {
		
			ans += Character.toLowerCase(s.charAt(i-1));
			ans += Character.toUpperCase(s.charAt(i));
			
		
		}
		ans += Character.toLowerCase(s.charAt(18));
		return ans;
	}

}
