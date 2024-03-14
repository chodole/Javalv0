package 기타조건_개념;

import java.util.Random;

public class 기타조건문2_개념02_elseif_else {
	public static void main(String[] args) {
		
		/*
	        [else if 와 else]
	            if에 추가 조건을 사용하기 위해 else if를 사용한 경우 else 또한 사용가능하다. 
	            단, else는 문맥상 가장 마지막에만 사용할 수 있다.
	            다음 가위바위보 식을 보면 기존식에선 조건이 7개 이었는데 
	            조건을 5개로 줄인걸 확인할 수 있다.
		*/
	
	    /*
	        [가위(0) 바위(1) 보(2) 게임]
	            [1] com 은 0~2 사이의 숫자를 랜덤 저장한다. 
	            [2] me 는 0~2 사이의 숫자를 랜덤 저장한다. 
	            [3] 가위,바위,보를 0,1,2 숫자로 대신 표현한다.
	            [4] com과 me를 비교해서 "비김" "승리" "패배" 를 출력한다.
	    */
		Random ran = new Random();
	
		int com = 0;
		int me = 0;
		
		com = ran.nextInt(3);
		me = ran.nextInt(3);
		
	    System.out.println(com + ", " + me);
	
	    if(me == com) {
	        System.out.println("비겼다.");
	
	    } else if(me == 0 && com == 2) {
	
	        System.out.println("내가 이겼다.");
	
	    } else if(me == 1 && com == 0) {
	        System.out.println("내가 이겼다.");
	
	    } else if(me == 2 && com == 1) {
	        System.out.println("내가 이겼다.");
	
	    } else {
	        System.out.println("내가 졌다.");
	    }
	
	    // 위와 같이 조건식이 길어진 경우 else if와 else를 활용하면 식을 효과적으로 줄일 수 있다.   
			
	}
}
