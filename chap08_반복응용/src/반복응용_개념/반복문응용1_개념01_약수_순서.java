package 반복응용_개념;

public class 반복문응용1_개념01_약수_순서 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            75의 약수 중에서 작은 수부터 큰 수를 출력했을 때, 
	            다섯 번째 약수를 출력하시오.
	        [정답]
	            25    
	    */
	
	    int num = 75;
	    int count = 0;
	
	    int i = 1;
	    int result = 0;
	    while(i <= num) {
	        if(num % i == 0) {
	            // System.out.print(i + " ");	// 정답확인용
	            count += 1;
	            if(count == 5) {
	                result = i;
	            }
	        }
	        i += 1;
	    }
	    /*
	        연속적으로 출력하는값이 아니라면, 
	        보통 반복문이 종료되고 결과를 적는것이 좋다.
	    */
	    System.out.println();
	    System.out.println(result);
		
	}
}
