package ex;

public class Boy_t {

	//������ ����
	int numOfMarble;
	
	//^������ : �ʱ�ȭ ����
	Boy_t(int num){
		numOfMarble = num;
		
	}
	
	//������ ���� ����
	void setMarble(int num) {
		numOfMarble = num;
		
	}
	
	void gameWin(Boy_t boy, int num) {
		numOfMarble+=num;
		boy.numOfMarble-=num; // ���
	}
	
	void showData() {
		System.out.println("���� ������ ������ ������ "+numOfMarble+"�� �Դϴ�.");
	}
	
	public static void main(String[] args) {
		
		//^ö�� ����
		Boy_t boy1 = new Boy_t(15);
		//^���� ����
		Boy_t boy2 = new Boy_t(9);
		
		//ö�� ����
		//Boy_t boy1 = new Boy_t();
		//���� ����
		//Boy_t boy2 = new Boy_t();
		
		//ö�� :15 	����: 9
		//boy1.setMarble(15);
		//boy2.setMarble(9);
		
		System.out.println("ö���� ������ "+boy1.numOfMarble+"�� ����, ����� ������ "+boy2.numOfMarble+"�� ����");
		
		//��1�� ���ӿ��� ��� 1�� ��� 2�� ���� 2���� ȹ���Ѵ١�
		System.out.println("1�� ���ӿ��� ��� 1�� ��� 2�� ���� 2���� ȹ���Ѵ�");
		boy1.gameWin(boy2, 2);
		//System.out.println(boy1.numOfMarble);
		
		//��2�� ���ӿ��� ��� 2�� ��� 1�� ���� 7���� ȹ���Ѵ�.��
		System.out.println("2�� ���ӿ��� ��� 2�� ��� 1�� ���� 7���� ȹ���Ѵ�.");
		boy2.gameWin(boy1, 7);
		//System.out.println(boy2.numOfMarble);
		
		System.out.println("ö��");
		boy1.showData();
		System.out.println("����");
		boy2.showData();
		
	}
	
}
