package 이차배열_개념;

import java.util.Arrays;

public class 이차배열4_개념07_정렬_이차원_문자_오름차순 {
	public static void main(String[] args) {
		/*
		        member 배열은 회원목록 리스트이다. 
		        데이터는 순서대로 번호, 이름, 등급 이다.
		
		*/
		
		String[][] member = {
		    {"1001", "김철수", "A"},         
		    {"1002", "이만수", "B"},         
		    {"1003", "오수정", "C"},        
		    {"1004", "박만삼", "A"},         
		    {"1005", "이영희", "B"},
		    {"1006", "송민아", "B"},         
		    {"1007", "이영희", "A"},        
		    {"1008", "이만수", "A"},             
		};
		
		/*
		  	[문제]
		  		학생들을 이름순으로 오름차순 정렬하시오.
		  	[정답]
		  		[1001, 김철수, A]
				[1004, 박만삼, A]
				[1006, 송민아, B]
				[1003, 오수정, C]
				[1002, 이만수, B]
				[1008, 이만수, A]
				[1005, 이영희, B]
				[1007, 이영희, A]

		 
		 */
		
		Arrays.sort(member,(a,b)->{
			if(a[1].compareTo(b[1])<0) {
				return-1;
			}else if(a[1].compareTo(b[1])>0) {
				return 1;
			}else {
				return 0;
			}
		});
		
		for(int i=0;i<member.length;i++) {
			System.out.println(Arrays.toString(member[i]));
		}
	}
}
