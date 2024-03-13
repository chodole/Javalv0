package 함수_개념;

public class 함수6_개념05_리턴배열맥스 {
	public static int getArrMax(int[] num) {
		int max = 0;
		for(int i=0;i<num.length;i++) {
			if(max<num[i]) {
				max = num[i];
			}
		}
		System.out.print(max+" ");
		
		return max;
	}
	public static void main(String[] args) {	
		/*
		[문제]
			arr과 arr2의 배열에서 각각 가장큰값을 출력하고,
			그합을 출력하시오.
			리턴함수로 만드시오.
		[정답]
			1243 111
			1354
		 */	

		int[] arr = {112, 343, 65, 2, 1243, 3};
		int[] arr2 = {4, 89, 111, 32, 23, 65};
		
		int sum = 0;
		
		sum += getArrMax(arr);
		sum += getArrMax(arr2);
		
		System.out.println();
		System.out.println(sum);
		
	}
}
