package ver03;

import java.util.Scanner;

public class PhoneBookManager {

	PhoneInfo creatInstace() {

		PhoneInfo info = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요 >> ");
		String name = sc.nextLine();

		System.out.println("전화번호를 입력하세요 >> ");
		String phoneNumber = sc.nextLine();

		System.out.println("생일을 입력하세요>> ");
		String birthday = sc.nextLine();

		if (birthday == null || birthday.trim().isEmpty()) {
			info = new PhoneInfo(name, phoneNumber);
		} else {
			info = new PhoneInfo(name, phoneNumber, birthday);
		}
		
		return info;
	}
}
