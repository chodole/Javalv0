package 배열_개념;

import java.util.Arrays;
import java.util.Random;

public class 배열4_개념01_랜덤교환 {
	public static void main(String[] args) {
		 /*
        [문제]
            랜덤으로 arr배열의 값을 교환해보자.  
        [예시]
            30과 40을 교환
            교환 전 = 10,20,30,40,50,60,70,80
            교환 후 = 10,20,40,30,50,60,70,80    
	    */
	
	    int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
	    
	    Random r = new Random();
	    System.out.println("교환전: "+Arrays.toString(arr));
	    int index1 = r.nextInt(arr.length);
	    int index2 = r.nextInt(arr.length);
	    
	    int temp = arr[index1];
	    arr[index1] = arr[index2];
	    arr[index2] = temp;
	    
	    System.out.println("교환후: "+Arrays.toString(arr));
	}
}
