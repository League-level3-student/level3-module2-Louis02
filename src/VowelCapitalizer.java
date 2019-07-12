
public class VowelCapitalizer extends SpecialString {

	public VowelCapitalizer(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		String ans = "";

		
		
		for (int i = 0; i < s.length(); i++) {
			if(i==0) {
				if(s.charAt(0)!=' ') {
					ans += Character.toUpperCase(s.charAt(0));
					i++;
				}
			}
			ans += Character.toLowerCase(s.charAt(i));
			
			
			if (s.contains(" ") == true) {
				char space = s.charAt(i);
				if (space == ' ') {
					if (i + 1 < s.length()) {
						ans += Character.toUpperCase(s.charAt(i + 1));
						i++;
					}
				}

			}

		}
		
		System.out.println(ans);
		return ans;
	}

}
