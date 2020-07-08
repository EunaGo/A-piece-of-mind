package guestbook.service;

import java.sql.Connection;
import java.sql.SQLException;

import guestbook.dao.MessageDao;
import guestbook.jdbc.ConnectionProvider;
import guestbook.model.Message;
import oracle.net.aso.e;

public class WriteMessageService {
	
	private WriteMessageService() {}
	
	private static WriteMessageService service = new WriteMessageService();
	public static WriteMessageService getInstance() {
		return service;
	}
	
	MessageDao dao = null;

	public int writeMessage(Message message) {
		int result = 0;
		
		dao = MessageDao.getInstance();
		
		// dao�� �޼��忡 ������ Connection
		Connection conn = null;
		
		try {
		conn = ConnectionProvider.getConnection();	
		result = dao.insertMessage(conn,message);	
		}catch(SQLException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
