package 비교_개념;

public class 비교3_개념03_짝수홀수 {
	public static void main(String[] args) {
		 /*
		[개념] 비교연산자를 활용해 짝수, 홀수 판별법 
			[1] 2의 배수이면 짝수이다.
			[2] 2의 배수가 아니면 홀수이다.
			[3] 0은 짝수로 취급한다. 
	*/

	/*
		a가 짝수이면 true 가 나오도록 식을 작성하시오.
	*/
	int a = 26;
	boolean a1 = a % 2 == 0;
	

		/*
			b가 홀수인면 true 가 나오도록 식을 작성하시오.
	
			홀수를 판별하는식은 3가지이다
	
			[1] b를 2로 나눈 나머지가 0이 아닐때
			[2] b를 2로 나눈 나머지가 0보다 클때
			[3] b를 2로 나눈 나머지가 1일때
	
		*/
		int b = 11;
		boolean b1 = a % 2 != 0;
		boolean b2 = a % 2 > 0;
		boolean b3 = a % 2 == 1;
	

	}

}
