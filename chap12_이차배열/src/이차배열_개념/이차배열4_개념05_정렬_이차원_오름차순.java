package 이차배열_개념;

import java.util.Arrays;

public class 이차배열4_개념05_정렬_이차원_오름차순 {
	public static void main(String[] args) {
		/*
		        student배열은 이번 학기 중간고사 성적이다.
		        가로 한 줄을 기준으로 맨 앞은 번호이고, 뒤에 숫자 3개는
		        각각 국어, 수학, 영어 점수이다. 
		*/

		int[][] student = {
		    {1001, 100, 20, 32},        
		    {1002,  40, 43, 12},         
		    {1003,  60, 21, 42},         
		    {1004,  76, 54, 55},        
		    {1005,  23, 11, 76}          
		};
		
			
		 /*
		  	[문제]
	        	국어 점수순으로 오름차순정렬을 하시오.
			[정답]
				[1005, 23, 11, 76]
				[1002, 40, 43, 12]
				[1003, 60, 21, 42]
				[1004, 76, 54, 55]
				[1001, 100, 20, 32]

	    */
		/*
		  	int[][] 배열은 형변환없이 람다식 정렬이 가능하다.
		  	int[] 배열만 형변환한다. 
		 
		 */
		
		Arrays.sort(student,(a,b)->{
			if(a[1]<b[1]) {
				return -1;
			}else if(a[1]>b[1]) {
				return 1;
			}else {
				return 0;
			}
		});
		
		for(int i = 0; i < student.length; i++) {
			System.out.println(Arrays.toString(student[i]));
		}
	}
}
