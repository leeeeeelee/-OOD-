package 객지설_주차장;

public class Message { //문자 전송
	   public void message_print(){ // 메세지 보냄 알람
	      System.out.println("메세지가 전송되었습니다.");
	   }
	   public void message_show(){ // 메세지 내용 출력
	      Gate_open o = new Gate_open();
	      long hour = o.open_time_hours();
	      long minute = o.open_time_minutes();
	      System.out.println("안녕하세요. 고객님! 저희 주차장을 이용해 주셔서 감사합니다.\n차량 진입시간은 " + hour + "시" + minute + "분 입니다.");
	      System.out.println("기본요금은 1시간당 1000원이며, 초과시 10분 당 200원입니다.\n감사합니다.");
	      System.out.println();
	   }
	}