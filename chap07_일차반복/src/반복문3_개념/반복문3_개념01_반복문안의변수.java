package 반복문3_개념;

public class 반복문3_개념01_반복문안의변수 {
	public static void main(String[] args) {
		
		/*
			[반복문 내부의 변수 활용]
				아래와 같은 문제가 있을때, 식이 더 길이지면 작성하고, 식별하는데 어려움이있다.
				그럴때는 식의 일부를 변수에 미리 저장하면 식을 작성하기 편하다.
				다만변수의 위치가 반복문 밖인지 안인지 구분을 잘해야한다. 
		*/
	
	    /*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 1 부터 15까지 출력한다. 
	            [2] 5보다 크고 10보다 작으면서 3의 배수일때는 숫자를 출력하시오. 그외는 "x" 를출력하시오.
	            [3] else 를 사용하지마시오.
				
	        [정답]
	         	x
				x
				x
				x
				x
				6
				x
				x
				9
				x
				x
				x
				x
				x
				x
	    */
	
		int i = 1;
		while(i <= 15) {
			boolean a = 5 < i && i < 10; 
			boolean b = i % 3 == 0;
			boolean c = 10 <= i || i <= 5;
	
			if(a && b){
				System.out.println(i);
			}
			if(c || !b){
				System.out.println("x");
			}
	
			i = i + 1;
		}
		
	}

}
