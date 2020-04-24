package scm;

public class ScmMain {

	public static void main(String[] args) {
		
		//상속 관계에서 다형성
		// 상위클래스 타입의 참조 변수 = 하위클래스의 인스턴스
		
		Product p = new Tv(100);
		
		Tv tv = new Tv(10);
		Computer com = new Computer(20);
		Audio aud = new Audio(30);
		
		int sum = tv.price+com.price+aud.price;
		
		Product p1 = tv;				// 자동 형변환
		Product p2 = com;			// 
		Product p3 = aud;			//
		
		
		//구매자가 제품을 구매하는 시뮬레이션
		//구매자 생성
		Buyer buyer = new Buyer();
		
		//제품 생성
		Tv product1 = new Tv(300);
		Computer product2 = new Computer(500);
		Audio product3 = new Audio(300);
		
		
		//Tv구매
		buyer.buy(product1);
		
		//Computer 구매
		buyer.buy(product2);
		
		//Audio 구매
		buyer.buy(product3);
		
		System.out.println("현재 보유금액은 "+buyer.money+"입니다.");
		System.out.println("현재 보유 포인트는 "+buyer.bonusPoint+"입니다.");
		
	}

}
