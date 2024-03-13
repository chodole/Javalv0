package 함수_개념;

public class 함수4_개념01_이차배열 {
	
	public static void solution(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			int result = arr[i][0] * arr[i][1];
			System.out.print(result+" ");
		}
	}
	
	public static void main(String[] args) {
		/*
     	 	[문제]
	            game배열의 가로 한 줄은 구구단 앞의 숫자와 뒤의 숫자를 의미한다.
	            앞의 숫자와 뒤의 숫자의 곱을 출력하시오.
	       
	        [정답]
	            24 18 24 81 6 42   
	    */

		int [][] darr = {
				{4,6},
				{3,6},
				{8,3},
				{9,9},
				{2,3},
				{6,7},
		};
		solution(darr);
		
	}
}
