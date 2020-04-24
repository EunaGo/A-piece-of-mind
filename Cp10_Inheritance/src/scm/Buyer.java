package scm;

public class Buyer {

	int money = 1000;		// 구매자의 소유금액
	int bonusPoint = 0;		// 구매자의 보유포인트
	
	Buyer(){
		this.money = 1000;		
		this.bonusPoint = 0;
	}
	
	void buy(Product p) {
		
		// 구매 상품의 금액과 나의 보유 금액 비교해서 구매여부 처리
		if(money < p.price) {
			System.out.println("잔액이 부족해서 구매할 수 없습니다.");
			return;
		}
		
		// 구매 처리 
		this.money -=p.price;	//보유한 금액에서 제품의 금액을 차감
		this.bonusPoint+=p.bonusPoint;	//보유한 포인트에 제품의 포인트를 추가
		System.out.println(p+"를 구매하셨습니다.");
	}
	

}
