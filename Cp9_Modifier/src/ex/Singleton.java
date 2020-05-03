package ex;

public class Singleton {
	
	// 1. �������� �������������� : private -> �ν��Ͻ� ���� �Ұ�
	private Singleton() {}
	
	// 2. ������ ��ü�� ����
	private static Singleton s = new Singleton();
	
	// 3. �������� ��ȯ�ϴ� �޼��� ����
	public static Singleton getInstance() {
		return s;
	}
	
	public void print() {
		System.out.println("Singleton !!");
	}
}