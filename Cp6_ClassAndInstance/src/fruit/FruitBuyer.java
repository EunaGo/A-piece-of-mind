package fruit;

public class FruitBuyer {

	//�Ӽ� => ����
	//1. ���� ���� ��
	//2. ����� ���
	
	int myMoney = 5000;
	int numOfApple = 0;
	
	//���ű�� => �޼���
	//1. ����ã��ޱ�
	//2. ������ �� ����
	//3. �������� ���� �ְ� �Ǹ� ��û > ����� ����
	//4. ����� ������ ���� ����� ������ŭ ������Ų��.
	//5. ������ ���� ���� ������ �����Ѵ�.
	
	
	public void buyApple(FruitSeller seller, int money) {
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult() {
		System.out.println("���� �ܾ�: "+myMoney);
		System.out.println("����� ���: "+numOfApple);
	}
	

}
