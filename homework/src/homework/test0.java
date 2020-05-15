package homework;

import java.io.InputStream;
import java.util.Scanner;

public class test0 {

	public static void main(String[] args) {
		String str = null;
		int i = 0;
		Scanner sc = new Scanner (System.in);
		
		try {
			i = sc.nextInt();
//			System.out.println(i);
			str = sc.nextLine();
			//System.out.println(str);
			str = sc.nextLine();
			
		}catch(Exception e) {
			System.out.println("오류");
		}
		System.out.println(i);
		System.out.println(str);

	}


}
