package 문자열_개념;

public class 문자열2_개념04_자르기_substring {
	public static void main(String[] args) {
		/*
	        [개념] 문자열 자르기
	            String 변수 = "문자열";
	            
	            [1] 변수 = 변수.substring(시작인덱스, 마지막인덱스 + 1);
	                특정 구간의 문자열을 잘라준다.
	
	            [2] 변수 = 변수.substring(시작인덱스);
	                시작인덱스부터 문자열의 끝까지 잘라준다.
	
	           
	    */
	
	    // 아래 문구에서 "java"를 잘라내 출력하시오.
	    String text = "hello,javascript";
	    String rs1 = text.substring(6, 10);
	    System.out.println(rs1);
	
	    // 아래 문구에서 "s john"를 잘라내 출력하시오.
	    String test = "hi my name is john"; // 공백도 문자열의 한글자로 취급된다.
	    String rs2 = test.substring(12);
	    System.out.println(rs2);
	    
	    // 아래 문구에서 5678 대신 ****로 표현하시오.
	    // 정답) 010-1234-****
	    String phoneNum = "010-1234-5678";
	    phoneNum = phoneNum.substring(0, phoneNum.length() - 4);
	    phoneNum += "****";
	    System.out.println(phoneNum);

	}

}
