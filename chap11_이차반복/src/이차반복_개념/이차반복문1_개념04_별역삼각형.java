package 이차반복_개념;

public class 이차반복문1_개념04_별역삼각형 {
	public static void main(String[] args) {
		 /*
	        [문제]
	            아래와 같이 삼각형을 그려보시오.  	
	        [정답]
	            ****
	            ***
	            **
	            *    
	    */
	    int size = 4;
	    for(int i=0; i < 4; i++) {
	        
	        for(int j = 0; j < size; j++) {
	        	System.out.print("*");
	        }
	        System.out.println();
	        size -= 1;
	    }

	}

}
