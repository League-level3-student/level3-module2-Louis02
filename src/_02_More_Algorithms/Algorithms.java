package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int ans =-1; 
		for(int i = 0; i<eggs.size();i++) {
		if(eggs.get(i).equals("cracked")) {
			ans=i;
			break;
		}
		}
		return ans;
	}
	public static int countPearls(List<Boolean>oysters)  {
		int ans = -1;
		int counter = 0;
		for(int i = 0; i<oysters.size();i++) {
			if(oysters.get(i)==true) {
				counter++;
				ans=counter;
			}
		}
		
		return ans;
	}
}
