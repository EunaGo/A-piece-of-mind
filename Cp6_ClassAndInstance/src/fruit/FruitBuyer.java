package fruit;

public class FruitBuyer {

	//속성 => 변수
	//1. 내가 가진 돈
	//2. 사들인 사과
	
	int myMoney = 5000;
	int numOfApple = 0;
	
	//구매기능 => 메서드
	//1. 셀러찾기받기
	//2. 지출할 돈 정의
	//3. 셀러에게 돈을 주고 판매 요청 > 사과의 개수
	//4. 사과의 개수를 받은 사과의 개수만큼 증가시킨다.
	//5. 지출한 돈은 나의 돈에서 차감한다.
	
	
	public void buyApple(FruitSeller seller, int money) {
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult() {
		System.out.println("남은 잔액: "+myMoney);
		System.out.println("사들인 사과: "+numOfApple);
	}
	

}
