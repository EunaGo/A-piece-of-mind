package fruit;

public class FruitSeller {

	//속성 => 변수
	//사과의 개수
	//수입
	//사과의 가격
	
	int numOfApple = 20; 			//사과의 개수
	int myMoney = 0;	 			//수입
	final int APPLE_PRICE = 1000;	//사과의 가격
	
	//기능 => 메서드
	//1. 돈을 받는다. (매개변수)
	//2. 사과를 판매한 개수를 구한다.
	//3. 나의 사과 개수 - 반환 사과개수
	//4. 받은금액을 나의 수입에 더해준다.
	//5. 사과의 개수를 반환한다.
	
	public int saleApple(int money) { //받는것 = 돈
		
		int num = money / APPLE_PRICE;
		numOfApple -=num;
		myMoney += money;
		return num;
	}	
	
	public void showSaleResult() {
		System.out.println("남은 사과: "+numOfApple);
		System.out.println("판매 수익: "+myMoney);
	}
	
}
