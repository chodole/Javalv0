package 이차배열_개념;

import java.util.Arrays;

public class 이차배열6_개념01_그룹바이_상품_개념 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            memberList는 회원목록데이터이다.
	            순서대로 회원번호 , 회원이름 이다.

	            itemList은 쇼핑몰 판매상품데이터이다.
	            순서대로 상품번호 , 상품이름 이다.

	            orderList는 오늘 주문 목록이다. 
	            순서대로 주문한 회원번호, 주문한 상품번호이다.
	            
	            상품별 판매개수를 출력하시오.
	            [상품번호, 상품이름 , 판매개수] 를 출력한다. 
	            단, 판매개수가 0인 상품은 출력하지않는다. 
	            단, 판매개수가 높은순으로 내림차순 출력한다. 
	            판매개수가 같으면 번호가낮은순으로 오름차순한다. 
	            
	        [정답] 
				[100001, 고래밥, 5]
				[100002, 새우깡, 2]
				[100003, 감자깡, 2]
				[100004, 칸쵸, 2]
				[100007, 고구마깡, 2]
				[100006, 빼빼로, 1]
	    */
	    String[][] memberList = {
	        {"3001","이만수"},
	        {"3002","김철민"},
	        {"3003","이영희"},
	        {"3004","조성아"},
	        {"3005","박민재"},
	        {"3006","유재석"}
	    };

	    String[][] itemList = {
	        {"100001", "고래밥"},
	        {"100002", "새우깡"},
	        {"100003", "감자깡"},
	        {"100004", "칸쵸"},
	        {"100005", "오징어땅콩"},
	        {"100006", "빼빼로"},
	        {"100007", "고구마깡"},
	        {"100008", "포카칩"}
	    };

	    int[][] orderList = {
	        {3001, 100001},
	        {3001, 100002},
	        {3003, 100001},
	        {3002, 100007},
	        {3003, 100006},
	        {3005, 100007},
	        {3002, 100001},
	        {3001, 100003},
	        {3003, 100002},
	        {3001, 100001},
	        {3002, 100003},
	        {3001, 100004},
	        {3003, 100004},
	        {3004, 100001}
	    };

	    String[][] viewList = new String[itemList.length][3];
	    
	    for(int i=0;i<itemList.length;i++) {
	    	viewList[i][0] = itemList[i][0];
	    	viewList[i][1] = itemList[i][1];
	    	viewList[i][2] = "0";
	    }
	    
	    for(int i=0;i<viewList.length;i++) {
	    	System.out.println(Arrays.toString(viewList[i]));
	    }
	    System.out.println();
	    
	    for(int i=0;i<viewList.length;i++) {
	    	for(int j=0;j<orderList.length;j++) {
	    		int number = Integer.parseInt(viewList[i][0]);
	    		if(number == orderList[j][1]) {
	    			int count = Integer.parseInt(viewList[i][2]);
	    			count++;
	    			viewList[i][2] = count+"";
	    		}
	    	}
	    }
	    
	    Arrays.sort(viewList, (a,b)->{
	    	if(a[2].compareTo(b[2])<0) {
	    		return 1;
	    	}else if(a[2].compareTo(b[2])>0) {
	    		return -1;
	    	}else {
	    		if(a[0].compareTo(b[0])<0) {
	    			return -1;
	    		}else if(a[0].compareTo(b[0])>0) {
	    			return 1;
	    		}else {
	    			return 0;
	    		}
	    	}
	    });
	    
	    for(int i = 0; i < viewList.length; i++){
	    	int count = Integer.parseInt(viewList[i][2]);
	    	if(count > 0) {
	    		System.out.println(Arrays.toString(viewList[i]));
	    	}
	    }
	}
}
