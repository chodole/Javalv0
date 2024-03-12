package 반복문5_개념;

public class 반복문5_개념04_배수누적 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 40 부터 100까지 출력한다. 
	            [2] 위 값중에서 5의배수만 출력한다.
	            [3] 5의배수의 누적을 출력하시오.
	            [4] 누적앞에는 total=을 붙이시오
	        [정답]
	            40
	            45
	            50
	            55
	            60
	            65
	            70
	            75
	            80
	            85
	            90
	            95
	            100
	            total=910
	    */
	
	    int total = 0;
	
	    int i = 40;
	    while(i <= 100) {
	        if(i % 5 == 0) {
	            System.out.println(i);
	            total += i;
	        }
	
	        i += 1;
	    }
	
	    System.out.println("total=" + total);
		
	}
}
