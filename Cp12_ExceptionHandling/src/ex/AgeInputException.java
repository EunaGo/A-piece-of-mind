package ex;

public class AgeInputException extends Exception {

	public AgeInputException() {
		super("유효하지 않은 나이가 입력됐습니다.");
	}
}
