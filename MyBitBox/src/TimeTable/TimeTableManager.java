package TimeTable;

/*
 *20.05.05 가격추가  
 *
 */
import java.util.LinkedList;
import java.util.Scanner;

import Movie.MovieManager;

public class TimeTableManager {
	
	private LinkedList<TimeTable> timeTableList;
	private int pos;
	Scanner ip = new Scanner(System.in);
	MovieManager mManager= MovieManager.getInstance();
	ScreenManager sManager = ScreenManager.getInstance();
	private static TimeTableManager ttManager = new TimeTableManager();
	public static TimeTableManager getInstatnce() {
		return ttManager;
	}
	
	
	int searchIndex;
	TimeTable ttTime;
	
	public TimeTableManager() {
		timeTableList = new LinkedList<>();
		
		timeTableList.add(new TimeTable(mManager.getMovieList().get(0), sManager.screenList.get(0), "9시"));
		timeTableList.add(new TimeTable(mManager.getMovieList().get(1), sManager.screenList.get(0), "12시"));
		timeTableList.add(new TimeTable(mManager.getMovieList().get(2), sManager.screenList.get(0), "15시"));
		
		timeTableList.add(new TimeTable(mManager.getMovieList().get(0), sManager.screenList.get(1), "10시"));
		timeTableList.add(new TimeTable(mManager.getMovieList().get(1), sManager.screenList.get(1), "13시"));
		timeTableList.add(new TimeTable(mManager.getMovieList().get(2), sManager.screenList.get(1), "16시"));
		
		timeTableList.add(new TimeTable(mManager.getMovieList().get(0), sManager.screenList.get(2), "12시"));
		timeTableList.add(new TimeTable(mManager.getMovieList().get(1), sManager.screenList.get(2), "9시"));
		timeTableList.add(new TimeTable(mManager.getMovieList().get(2), sManager.screenList.get(2), "17시"));
		
	}
	
	//시간표를 받아서 종료시간을 추가해서 새로운 시간표 반환
	TimeTable calcEndTime(TimeTable timeT) {
		String restr = timeT.getTime().replaceAll("[^0~9]", "");
		
		int hour = timeT.getMovie().getRuntime()/60;
		int minutes = timeT.getMovie().getRuntime()%60;
		int end = Integer.parseInt(restr)+minutes+ (hour*100);
		
		String endTime = Integer.toString(end);
	
		StringBuffer sb = new StringBuffer(endTime);
		sb.insert(endTime.length()-2, ":");
		String result= sb.toString();
		
		timeT.setTime(timeT.getTime()+"~"+result);
		return timeT;
	}
	
	int selectMovie() {
		int selectM;
		System.out.println("<<영화 목록>>");
		for(int i=0; i< mManager.getMovieList().size();i++) {
			System.out.println(i+")");
			System.out.println(mManager.getMovieList().get(i).getTitle());
			System.out.println("-----------");
		}
		
		System.out.println("시간 표에 입력하실 영화의 번호를 입력:");
		selectM = ip.nextInt();
		ip.nextLine();
		return selectM;
	}
	
	int selectScreen() {
		int selectS;
		System.out.println("<<상영관 목록>>");
		for (int i=0; i<sManager.screenList.size();i++) {
			System.out.println(i+")");
			System.out.println(sManager.screenList.get(i).getName());
			System.out.println("-----------");
		}
		System.out.println("영화를 상영할 상영관 입력");
		selectS = ip.nextInt();
		ip.nextLine();
		
		return selectS;
		
		
	}
	
	TimeTable createTimeInst() {
		
		ttTime=null;
		
		int selectM;
		int selectS;
		System.out.println("<<영화 목록>>");
		for(int i=0; i< mManager.getMovieList().size();i++) {
			System.out.println(i+")");
			System.out.println(mManager.getMovieList().get(i).getTitle());
			System.out.println("-----------");
		}
		
		System.out.println("시간 표에 입력하실 영화의 번호를 입력:");
		selectM = ip.nextInt();
		ip.nextLine();
		
		System.out.println("<<상영관 목록>>");
		for (int i=0; i<sManager.screenList.size();i++) {
			System.out.println(i+")");
			System.out.println(sManager.screenList.get(i).getName());
			System.out.println("-----------");
		}
		System.out.println("영화를 상영할 상영관 입력");
		selectS = ip.nextInt();
		ip.nextLine();
		
		System.out.println("시간 입력 :");
		String h= ip.nextLine();
		System.out.println("분 입력 :");
		String min = ip.nextLine();
		
		String t1 = h+"시 "+min+"분";
		
		for(int i=0;i<timeTableList.size();i++) {
	         if(t1.equals(timeTableList.get(i).getTime())){
	            if(timeTableList.get(i).getScreen().getName().equals(sManager.screenList.get(selectS).getName())) {
	               System.out.println("입력하신 시간에 이미 스케쥴이 있습니다");
	            }
	         }
	      }

		ttTime=new TimeTable(mManager.getMovieList().get(selectM), sManager.screenList.get(selectS), t1);
		
//		timeTableList.add(new TimeTable(mManager.getMovieList().get(selectM), sManager.screenList.get(selectS), t1));
//		timeTableList.get(0).showTimeTable();
		
		return ttTime;
		
	}
	
	void addInst(TimeTable ttTime) {
		timeTableList.add(ttTime);
	}
	
	
	
	/*
public int searchIndexNum(String movie) {
		
		searchIndex = -1;
		
		for(int i=0;i<timeTableList.size();i++) {
			if(timeTableList.get(i).checkTimeTable(movie)) {
				searchIndex=i;
				break;
			}
		}
		return searchIndex;
	}
	
	*/
	
	
	
	
	
	
	void edit() {
		
		
		System.out.println("수정할 목록을 고르시오");
		for(int i=0; i<timeTableList.size(); i++) {
			System.out.print(i+") ");
			timeTableList.get(i).showTimeTable();
		}
		
		int index = ip.nextInt();
		ip.nextLine();
		
		
		System.out.println("1. 영화 수정");
		System.out.println("2. 상영관 수정");
		System.out.println("3. 시간 수정");
		
		int choice = ip.nextInt();
		ip.nextLine();
		
		switch (choice) {
		case 1:
			System.out.println("어느 영화로 바꾸시겠습니까?");
			for(int i=0; i<mManager.getMovieList().size(); i++) {
				System.out.println(i+")" + mManager.getMovieList().get(i).getTitle());
				
			}
				int changemovie = ip.nextInt();
				ip.nextLine();
				
			timeTableList.get(index).setMovie(mManager.getMovieList().get(changemovie));
			
			// 바꼇나 다시 출력 지워도됨
			for(int i=0; i<timeTableList.size(); i++) {
				System.out.print(i+") ");
				timeTableList.get(i).showTimeTable();
			}
			
			break;

		case 2: 
			
			System.out.println("어느 상영관으로 바꾸시겠습니까?");
			for(int i=0; i<sManager.screenList.size(); i++) {
				System.out.println(i+")" + sManager.screenList.get(i).getName());
				
			}
			
			int changescreen = ip.nextInt();
			ip.nextLine();
			
			timeTableList.get(index).setScreen(sManager.screenList.get(changescreen));
			
			// 바꼇나 다시 출력 지워도됨
			for(int i=0; i<timeTableList.size(); i++) {
				System.out.print(i+") ");
				timeTableList.get(i).showTimeTable();
			}
					
			
		
			break;
		case 3:
			System.out.println("변경할 시간을 입력하세요");
			
			System.out.println("시간 입력 :");
			String h= ip.nextLine();
			System.out.println("분 입력 :");
			String min = ip.nextLine();
			
			String t1 =  h+"시"+min+"분";
			
			
			
			timeTableList.get(index).setTime(t1);
			
			// 바꼇나 다시 출력 지워도됨
			for(int i=0; i<timeTableList.size(); i++) {
				System.out.print(i+") ");
				timeTableList.get(i).showTimeTable();
			}
			

		}
		
		
		
		
		
				//-------------
		
//		table.remove(searchIndex);
//		TimeTable.add(new TimeTable(movie, screen, time));
			
	}

	public LinkedList<TimeTable> getTable() {
		return timeTableList;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}
	
	
	
	
	
}
