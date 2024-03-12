package 반복응용_개념;

public class 반복문응용8_개념01_dowhile예제 {
	public static void main(String[] args) {
		
		/*
			[do - while문]
			1. while문의 변형된 형태이다.
			2. 구조
				1) do			: 조건식이 없기 때문에 일단 실행부터 한다.
				2) {}			: 실행할 문장
				3) while(조건)	: 위에서 실행을 먼저 하고 조건을 검사한다.
								  조건이 사실이면 다시 do로 이동한다.
				4) [주의] ; 세미콜론을 반드시 붙여야한다.	
				
			3. 실제로 거의 사용하지않기때문에 이런문법이 있는정도만 알면된다.	
		*/

		int i = 1;
		do {
			System.out.println("do-while");
			i += 1;
		} while ( i < 5 );

		i = 1;
		while(i < 5) {
			System.out.println("while");
			i += 1;
		}

	}
}
