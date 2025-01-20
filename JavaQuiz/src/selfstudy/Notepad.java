package selfstudy;

public class Notepad {
	
	public static void main(String[] args) {
		
		Solution();
		
	}
	
}


class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i = 1; i <= k; i++) {
        	answer += my_string;
        }
        return answer;
    }
}