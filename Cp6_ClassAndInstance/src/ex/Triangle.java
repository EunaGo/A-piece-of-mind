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

	
	float area() {
		
		float result = width*height/2f;
		
		return result;
		
	}

	public static void main(String[] args) {
		
		//삼각형 객체생성
		Triangle t = new Triangle();
		
		//데이터 설정
		t.setData(5,3);
		
		System.out.println("삼각형의 밑변: "+t.width);
		System.out.println("삼각형의 높이: "+t.height);
		
		//넓이를 구하는 메서드 실행
		System.out.println("삼각형의 넓이: "+t.area());
		
	}
	
}
