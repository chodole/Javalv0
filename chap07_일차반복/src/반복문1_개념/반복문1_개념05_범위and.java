package 반복문1_개념;

public class 반복문1_개념05_범위and {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 숫자를 1 부터 10까지 출력한다. 
	            [2] 4보다크고 8보다 작으면 숫자대신 "x" 를 출력한다.
	            [3] else 를 사용하지마시오.
	        [정답]
	            1
	            2
	            3
	            x
	            x
	            x
	            x
	            8
	            9
	            10
	    */
	  
	    int i = 1;
	    while(i <= 10){
	        if(4 <= i && i < 8){
	            System.out.println("x");
	        }
	        if(i < 4 || i > 7)
	        {
	            System.out.println(i);
	        }
	        i += 1;
	    }
		
	}
}
