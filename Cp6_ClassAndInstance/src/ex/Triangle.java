package ex;

public class Triangle {
	
	
	//변수: 밑변, 높이
	int width, height; //전역변수
	
	//메서드: 변환? 매개변수?
	//		1. 밑변과 높이의 데이터를 변경하는 메서드
	void setData(int w, int h) { //지역변수 
		
		width = w;
		height = h;
		
	}  
	
	//생성자 : 인스턴스 생성시에 반드시 한번 실행 > 인스턴스 변수들의 초기화 작업
	//		생략 가능(default Contructor)
	
	//기본 생성자
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
		
		//삼각형 객체생성
		//Triangle t = new Triangle();
		Triangle t = new Triangle(5,3);
		
		//데이터 설정
		t.setData(5,3);
		
		System.out.println("삼각형의 밑변: "+t.width);
		System.out.println("삼각형의 높이: "+t.height);
		
		//넓이를 구하는 메서드 실행
		System.out.println("삼각형의 넓이: "+t.area());
		
	}
	
}
