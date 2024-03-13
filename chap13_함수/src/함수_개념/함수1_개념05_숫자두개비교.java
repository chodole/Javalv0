package 함수_개념;

import java.util.Random;

public class 함수1_개념05_숫자두개비교 {
	/*
    [문제]
        1부터 100 사이의 숫자 두 개를 랜덤으로 저장한다.
        두 숫자 중 더 큰 숫자를 출력하시오.
        단, 서로 같으면 "같다"를 출력하시오.
    [예시]
        76 5
        76
   */
	
	public static void compareNum(int n1, int n2) {
		if(n1>n2) {
			System.out.println(n1);
		}else if(n1<n2) {
			System.out.println(n2);
		}else {
			System.out.println("같다");
		}
	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		int n1 = ran.nextInt(100)+1;
		int n2 = ran.nextInt(100)+1;
		System.out.println(n1+","+n2);
		compareNum(n1,n2);
	}
}
