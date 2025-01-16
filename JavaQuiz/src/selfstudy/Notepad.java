package selfstudy;

import java.util.Arrays;

public class Notepad {

}


class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int fir = 0;
        int sec = 0;
        int thr = 1001;
        for(int i = 0; i < sides.length; i++) {
        	if(sides[i] > fir) {
        		fir = sides[i];
        	} else if(sides[i] < thr) {
        		thr = sides[i];
        	} else if(sides[i] > thr && sides[i] < fir) {
        		sec = sides[i];
        	}
        }
        if(sec+thr > fir) {
        	answer = 1;
        } else {
        	answer = 2;
        }
        return answer;
    }
}