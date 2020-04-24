package friend;

import java.util.Scanner;

public class FriendInfoHandler {

	// Friend 타입의 정보를 저장할 배열을 가진다.
	// 친구정보를 저장하는 기능
	// 친구정보의 기본 정보 출력기능
	// 친구정보 상세 정보 출력기능

	private Friend[] myFriends;
	private int numOfFriends;

	Scanner kb;

	public FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
	}

	void addFriendInfo(Friend fren) {
		// 배열에 저장
		myFriends[numOfFriends++] = fren;
	}

	// 2. 사용자에게 데이터를 받아 사용자 요청에 맞는 인스턴스 생성
	// HighFriend / UnivFriend
	void addFriend(int choice) {

		// 기본 정보 받기
		System.out.println("이름을 입력해주세요.");
		String name = kb.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		String phoneNum = kb.nextLine();
		System.out.println("주소를 입력해주세요.");
		String addr = kb.nextLine();

		Friend friend = null;
		if (choice == 1) {
			// 1일 때 정보 받기
			System.out.println("직업을 입력해주세요.");
			String work = kb.nextLine();

			// HighFriend 인스턴스를 생성
			friend = new HighFriend(name, phoneNum, addr, work);
		} else {
			// 2일 때 정보 받기
			System.out.println("전공을 입력해주세요.");
			System.out.println("학년을 입력해주세요.");
			String major = kb.nextLine();
			String grade = kb.nextLine();

			// UnivFriend 인스턴스를 생성
			// Integer.parseInt(grade) >> String을 int로 변환
			friend = new UnivFriend(name, phoneNum, addr, major, Integer.parseInt(grade));
		}
		// addFriendInfo 호출
		addFriendInfo(friend);
	}

	// 친구정보의 기본 정보 출력 기능
	void showAllSimpleData() {

		System.out.println("친구의 기본 정보를 출력합니다. =============");
		for (int i = 0; i < numOfFriends; i++) {
			myFriends[i].showBasicInfo();
			System.out.println("--------------------------");
		}
	}

	void showAllData() {
		System.out.println("===친구의 모든 정보를 출력합니다.===");
		for (int i = 0; i < numOfFriends; i++) {
			myFriends[i].showBasicInfo();
		}
	}

}
