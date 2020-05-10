package user.exception;

public class EmptyIntegerException extends Exception {

	public EmptyIntegerException() {
		super("아무것도 입력하지 않으셨습니다. \n메뉴를 입력해주세요.");
	}

	
}
