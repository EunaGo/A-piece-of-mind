package ex;

public class Boy_t {

	//구슬의 개수
	int numOfMarble;
	
	//^생성자 : 초기화 목적
	Boy_t(int num){
		numOfMarble = num;
		
	}
	
	//구슬의 개수 설정
	void setMarble(int num) {
		numOfMarble = num;
		
	}
	
	void gameWin(Boy_t boy, int num) {
		numOfMarble+=num;
		boy.numOfMarble-=num; // 상대
	}
	
	void showData() {
		System.out.println("현재 보유한 구슬의 개수는 "+numOfMarble+"개 입니다.");
	}
	
	public static void main(String[] args) {
		
		//^철수 생성
		Boy_t boy1 = new Boy_t(15);
		//^영희 생성
		Boy_t boy2 = new Boy_t(9);
		
		//철수 생성
		//Boy_t boy1 = new Boy_t();
		//영희 생성
		//Boy_t boy2 = new Boy_t();
		
		//철수 :15 	영희: 9
		//boy1.setMarble(15);
		//boy2.setMarble(9);
		
		System.out.println("철수는 구슬을 "+boy1.numOfMarble+"개 보유, 영희는 구슬을 "+boy2.numOfMarble+"개 보유");
		
		//“1차 게임에서 어린이 1은 어린이 2의 구슬 2개를 획득한다”
		System.out.println("1차 게임에서 어린이 1은 어린이 2의 구슬 2개를 획득한다");
		boy1.gameWin(boy2, 2);
		//System.out.println(boy1.numOfMarble);
		
		//“2차 게임에서 어린이 2는 어린이 1의 구슬 7개를 획득한다.”
		System.out.println("2차 게임에서 어린이 2는 어린이 1의 구슬 7개를 획득한다.");
		boy2.gameWin(boy1, 7);
		//System.out.println(boy2.numOfMarble);
		
		System.out.println("철수");
		boy1.showData();
		System.out.println("영희");
		boy2.showData();
		
	}
	
}
