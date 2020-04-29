package homework;

public class Ball {

	public static void main(String[] args) {
		
		String[][] a;
		
		
		a = new String[10][10]; 
		
		
		String ball = "●";
		String space = " ";
		
		
		
		while (true) {
			
			a[0][0]=ball;
			System.out.println(a[0][0]);
			System.out.println(a[1][0]);
			a[1][0]=ball;
			System.out.println(a[0][0]);
			System.out.println(a[1][0]);
			a[0][0]=space;
			System.out.println(a[0][0]);
			System.out.println(a[1][0]);
			a[1][0]=ball;
			System.out.println(a[0][0]);
			System.out.println(a[1][0]);
			a[1][0]=space;
			System.out.println(a[0][0]);
			System.out.println(a[1][0]);
			
			
			
			
			
//			System.out.println(ball);
//			System.out.println(space);
			
			
		}

	}

}
