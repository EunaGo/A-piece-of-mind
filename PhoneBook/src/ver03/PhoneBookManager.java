package ver03;
import java.util.Scanner;

/*
Project : ver 0.30

배열을 이용해서 프로그램 사용자가 입력하는 정보가 최대 100개까지 유지되도록 프로그램을 변경. 

아래기능 삽입

저장 : 이름, 전화번호, 생년월일 정보를 대상으로 하는 저장
검색 : 이름을 기준으로 데이터를 찾아서 해당 데이터의 정보를 출력
삭제 : 이름을 기준으로 데이터를 찾아서 해당 데이터를 삭제

데이터 삭제 후 남아있는 데이터 처리는 데이터를 빈 공란이 없이 순차적으로
재정리 2번이 삭제되었다면 3번 이후 데이터들의 주소 값이 -1 처리되어 재저장.
 */

public class PhoneBookManager {
	
	PhoneInfor[] pBooks;
	
	//입력된 친구의 정보 개수 >> 입력된 배열의 요소 개수
	//1. 참조할 때 반복의 횟수
	//2. 새로운 객체를 저장할때 index로 사용
	
	int cnt=0;
	
	public PhoneBookManager() {
		
	pBooks = new PhoneInfor[100];
	
	}
	
	// 저장 : 이름, 전화번호, 생년월일 젇보를 대상으로 하는 저장
	//배열에 PhoneInfor 타입의 참조값을 저장
	void addInfo(PhoneInfor info) {
		
		//배열에 요소 대입
		pBooks[cnt] = info;
		
		//등록된 정보의 개수를 증가
		cnt++;
	}

	// 사용자의 입력데이로 PhoneInfor 객체를 생성
	PhoneInfor creatInstacne() {


		
		PhoneInfor info = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("친구의 정보를 저장하기 위한 데이터를 입력: ");
		System.out.println("이름을 입력: ");
		
		String name = sc.nextLine();
		
		System.out.println("전화번호 입력: ");
		String phoneNumber=sc.nextLine();
		
		System.out.println("생일을 입력: ");
		String birthday = sc.nextLine();
		
		//사용자의 입력 데이터에 따라 인스턴스 생성을 방법을 구분
		if(birthday==null||birthday.trim().isEmpty()) {
			info = new PhoneInfor(name,phoneNumber);
		}else {
			info = new PhoneInfor(name, phoneNumber, birthday);
		}
		
		
		return info;
	}


	void showAllData() {
		
	}
	
	
	}
