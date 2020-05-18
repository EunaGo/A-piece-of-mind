package user.exception;

public class AgeLimitException extends Exception {
	public AgeLimitException() {

		super("연령제한으로 선택하신 영화는 예매가 불가합니다.");

	}
}
