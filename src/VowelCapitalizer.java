package _00_Text_Funkifier;

public class VowelCapitalizer extends SpecialString{

	public VowelCapitalizer(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		String ans = "";
		
		for(int i =0; i<s.length();i++) {
				if(s.contains("a")==true) {
			int at  = s.indexOf("a");
			ans += Character.toUpperCase(at);
					
		}
		}
		
		
	
		if(s.contains("e")==true) {
			int at  = s.indexOf("e");
			ans += Character.toUpperCase(at);
					
		}
		if(s.contains("i")==true) {
			int at  = s.indexOf("i");
			ans += Character.toUpperCase(at);
					
		}
		if(s.contains("o")==true) {
			int at  = s.indexOf("o");
			ans += Character.toUpperCase(at);
					
		}
		if(s.contains("u")==true) {
			int at  = s.indexOf("u");
			ans += Character.toUpperCase(at);
					
		}
				
			
		
		
				
		
		return ans;
	}

}
