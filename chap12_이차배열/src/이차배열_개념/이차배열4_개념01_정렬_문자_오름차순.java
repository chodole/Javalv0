package 이차배열_개념;

import java.util.Arrays;

public class 이차배열4_개념01_정렬_문자_오름차순 {
	public static void main(String[] args) {
		/*
	        [개념] 배열 문자열 오름차순 정렬
	            (1) Arrays.sort();
	            
	        [당곡, 미금, 수서, 양재, 정자]
	    */
	
	    String[] arr = {"미금", "당곡", "정자", "수서", "양재"};
	
	    Arrays.sort(arr);
	    
	    System.out.println(Arrays.toString(arr));
	}
}
