package 반복응용_개념;

public class 반복문응용2_개념01_무한반복_배수개수 {
	public static void main(String[] args) {
		/*
		[무한반복문]
			아래 와 같은 문제가 있을때, 약수와 달리 배수는 그끝이 무한대이다. 
			그러므로 무한반복을 사용하고 원하는 조건을 찾았을때 반드시 종료해야한다.
			boolean run = true 변수를 사용해서 무한반복을 만들고, 
			run = false 를 통해서 반복문을 종료시킨다.
		[문제] 
			7의 배수 중 작은수부터 3개만 출력 하시오.
		[정답]
			7
			14
			21
		 */
		
		int i = 1;
		int count = 0;
		
		boolean run = true;
		// run 이 true 이므로 무한이 반복된다.
		while(run) {

			if(i % 7 == 0) {
				count += 1;
				System.out.println(i);

				if(count == 3) {
					run = false;
				}
			}

			if(run){
				i = i + 1;
			}
		}
		
		System.out.println("종료.");
	}
}
