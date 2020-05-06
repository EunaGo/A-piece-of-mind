package ver03;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		PhoneBookManager manager = new PhoneBookManager();
		
		PhoneInfo info = null;
		
		while(true) {
			info = manager.creatInstace();
			info.showInfo();
		}

	}

}
