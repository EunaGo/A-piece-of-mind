package ex;

public class Triangle {
	
	
	//����: �غ�, ����
	int width, height; //��������
	
	//�޼���: ��ȯ? �Ű�����?
	//		1. �غ��� ������ �����͸� �����ϴ� �޼���
	void setData(int w, int h) { //�������� 
		
		width = w;
		height = h;
		
	}  
	
	//������ : �ν��Ͻ� �����ÿ� �ݵ�� �ѹ� ���� > �ν��Ͻ� �������� �ʱ�ȭ �۾�
	//		���� ����(default Contructor)
	
	//�⺻ ������
	Triangle(){
		
	}
	
	Triangle(int w, int h){
		width = w;
		height = h;
	}

	
	float area() {
		
		float result = width*height/2f;
		
		return result;
		
	}

	public static void main(String[] args) {
		
		//�ﰢ�� ��ü����
		//Triangle t = new Triangle();
		Triangle t = new Triangle(5,3);
		
		//������ ����
		t.setData(5,3);
		
		System.out.println("�ﰢ���� �غ�: "+t.width);
		System.out.println("�ﰢ���� ����: "+t.height);
		
		//���̸� ���ϴ� �޼��� ����
		System.out.println("�ﰢ���� ����: "+t.area());
		
	}
	
}
