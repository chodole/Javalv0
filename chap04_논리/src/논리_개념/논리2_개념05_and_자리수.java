package 논리_개념;

public class 논리2_개념05_and_자리수 {
	public static void main(String[] args) {
		/*
			[문제] 
				아래 변수a의 백의 자리가 3이고 , 십의 자리가 4이면 true를 출력하게 만드시오.
			[정답]
				true
		*/
	
		int a = 3340;
	
		int b = (a % 1000 / 100);
		int c = (a % 100 / 10);
	
		boolean result = b == 3 && c == 4;
	}
}
