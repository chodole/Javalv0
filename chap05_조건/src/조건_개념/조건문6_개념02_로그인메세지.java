package 조건_개념;

import java.util.Random;

public class 조건문6_개념02_로그인메세지 {
	public static void main(String[] args) {
		/*
			[문제]	
				철수는 어떤사이트에 회원가입을 했다. 아이디는 7 비밀번호는 5로 등록을 했다. 
				지금 철수는 로그인을 시도하고있다. 
				랜덤숫자(1~10)을 각각 a 와 b 에 저장한다. 
				a는 로그인아이디를 뜻하고 , b는 로그인비밀번호를 뜻한다. 
	
				joinId와 a를 비교하고 joinPw와 b를 비교해서 
				상황에 맞춰서 아래와같이 3가지 메세지를 출력하시오.
	
				"로그인성공" 
				"아이디가틀렸습니다" 
				"비밀번호가틀렸습니다" 
				
		*/
		/*
			이해를 돕기위해 아이디와 비밀번호는 전부 한자리 숫자를 사용한다.
		*/
		/*	
			경우에 따라서는 중첩조건문이 식이 보기좋고 작성하기 편리할때가있다.
		*/
		int joinId = 7;
		int joinPw = 5;
		
		int a = 0;
		int b = 0;
		
		Random ran = new Random();
		a = ran.nextInt(10) + 1;
		System.out.println(a);
		
		if(joinId == a) {
			// 비밀번호 저장은 아이디가 맞지않은시점에서 필요없으므로 여기에 작성한다.
			b = ran.nextInt(10) + 1;
			System.out.println(b);
			
			if(joinPw == b) {
				System.out.println("로그인 성공");
			}
			if(joinPw != b) {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}

		if(joinId != a) {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
}
