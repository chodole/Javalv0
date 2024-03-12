package 배열_개념;

import java.util.Arrays;
import java.util.Random;

public class 배열5_개념03_전부짝수 {
	public static void main(String[] args) {
		 /*
        [문제]
            arr배열에 0~9사이의 랜덤 값을 4개 저장한 후 출력한다. 
            배열안의 값들이 모두 짝수면 "1등",
            모두 홀수이면 "2등" , 이외는 "꽝" 을 출력한다.
            단, 0은 짝수이다.
        [예시] 
            4, 6, 2, 0 : 1등
            5, 2, 0, 4 : 꽝    
		  */
		
		int[] arr = new int[4];
		Random r = new Random();
		
		for(int i=0;i<arr.length;i++) {
			int rnum = r.nextInt(10);
			arr[i]=rnum;
		}
		
		System.out.print(Arrays.toString(arr));
		
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count++;
			}
		}
		
		if(count==arr.length) {
			System.out.println(" : 1등");
		}else if(count == 0){
			System.out.println(" : 2등");
		}else {
			System.out.println(" : 꽝");
		}
		
	}
}
