package 논리_개념;

public class 논리2_개념04_or_약수 {
	public static void main(String[] args) {
		/*
			[문제] 
				변수 a의  값이 45의 약수이거나, 28의 약수인지 구하시오.
			[정답]
				true
		*/
	
		int a = 4;
		boolean result = 45 % a == 0 || 28 % a == 0;

	}
}
