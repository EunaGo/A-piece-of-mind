package user;

import Ticket.Ticket;

public class Info {
	
	Ticket ticket;
	private int myMoney;
	private int point;
	private String birth;
	
	public int getMyMoney() {
		return myMoney;
	}
	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getBirth() {
		return birth;
	}
//	public void setBirth(int birth) {
//		this.birth = birth;
//	}
	

	
}
