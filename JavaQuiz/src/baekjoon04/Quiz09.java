package baekjoon04;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz09 { // 바구니 뒤집기
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // 바구니의 갯수 입력 받음
		int[] arr = new int [n]; // 바구니 n개만큼 배열 생성
		int m = scan.nextInt(); // 역순으로 몇번 바꿀지 입력 받음
		int temp = 0; // 임시저장소 생성
		
		// {1 2 3 4 5} n=5
		//  0 1 2 3 4
		
		for(int i = 0; i < n; i++) { //초기 바구니 배열값 입력
			arr[i] = i+1;
		}
		
		//m=4
		// {1 2 3 4 5} n=5
		//  0 1 2 3 4
		// (1 2) (3 4) (1 4) (2 2)
		// 첫번째와 두번째 사이를 역순으로 바꿔라
		// 세번째와 네번째 사이를 역순으로
		// 첫번째와 네번째 사이를 역순으로 첫째와 넷째 
		
		for(int i = 1; i <= m; i++) { //m회에 걸쳐서 바꿀값들 입력 받음
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			
			
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
