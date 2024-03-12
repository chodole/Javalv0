package 이차반복_개념;

public class 이차반복문1_개념01_기본 {

	public static void main(String[] args) {
		/*
	        [개념] 2차원 반복문
	            반복문 2개를 사용해서 사각형의 데이터를 표현할 수 있다.
	            [1] 첫번째 반복문 i가 세로를 담당한다.
	            [2] 두번째 반복문 j가 가로를 담당한다.
	    
	            i가 0 일때, j 는 0 1 2 3
	            i가 1 일때, j 는 0 1 2 3
	            i가 2 일때, j 는 0 1 2 3
	        
	            3 * 4 = 12 총 12번 반복을 하게된다. 
	
	            보통 세로는 i나 y를 사용하고 , 가로는 j나 x를 사용한다.    
	    */
	
	    for(int i = 0; i < 3; i++) {
	        for(int j = 0; j < 4; j++) {
	        	System.out.println("[i] = " + i + ", [j] = " + j);
	        }
	    }

	}
}
