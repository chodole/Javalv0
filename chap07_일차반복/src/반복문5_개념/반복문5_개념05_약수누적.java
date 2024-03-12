package 반복문5_개념;

public class 반복문5_개념05_약수누적 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            아래조건을 전부 만족시키는 식을 작성해, 정답과 똑같이 출력하시오.
	            [1] 반복문을 사용하여 18의 약수만출력한다.
	            [2] 18의약수들의 누적을 출력하시오.
	            [3] 누적앞에는 total=을 붙이시오
	        [정답]
	            1
	            2
	            3
	            6
	            9
	            18
	            total=39
	    */
	    int num = 18;
	
	    int total = 0;
	    int i = 1;
	    while(i <= num) {
	        if(num % i == 0) {
	            System.out.println(i);
	            total += i;
	        }
	        i += 1;
	    }
	
	    System.out.println("total=" + total);
		
	}
}
