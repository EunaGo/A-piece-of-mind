package fruit;

public class FruitSeller {

	//�Ӽ� => ����
	//����� ����
	//����
	//����� ����
	
	int numOfApple = 20; 			//����� ����
	int myMoney = 0;	 			//����
	final int APPLE_PRICE = 1000;	//����� ����
	
	//��� => �޼���
	//1. ���� �޴´�. (�Ű�����)
	//2. ����� �Ǹ��� ������ ���Ѵ�.
	//3. ���� ��� ���� - ��ȯ �������
	//4. �����ݾ��� ���� ���Կ� �����ش�.
	//5. ����� ������ ��ȯ�Ѵ�.
	
	public int saleApple(int money) { //�޴°� = ��
		
		int num = money / APPLE_PRICE;
		numOfApple -=num;
		myMoney += money;
		return num;
	}	
	
	public void showSaleResult() {
		System.out.println("���� ���: "+numOfApple);
		System.out.println("�Ǹ� ����: "+myMoney);
	}
	
}
