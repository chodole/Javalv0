package 이차반복_개념;

public class 이차반복문4_개념03_내앞만출력_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            각각의 배열의 값들이 배열전체의 값들과 비교하면서 현재값의 앞에 위치한 값들만 출력하시오.
	        [정답]
	            =10
	            10 =20
	            10 20 =30
	            10 20 30 =40
	            10 20 30 40 =30
	            10 20 30 40 30 =10
	            10 20 30 40 30 10 =50
	            10 20 30 40 30 10 50 =60
	    */

	    int[] arr = {10, 20, 30, 40, 30, 10, 50, 60};

	    for(int i = 0; i<arr.length; i++) {
	        for(int j = 0; j < i; j++){
	            
	            System.out.print(arr[j] + " ");
	            
	        }
	        System.out.println("="+arr[i]);
	    }

	}
}
