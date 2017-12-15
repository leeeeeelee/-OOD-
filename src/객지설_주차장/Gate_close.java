package 객지설_주차장;

public class Gate_close { //게이트 클로즈
	   public void close() {//출력
	      System.out.println("========== GATE CLOSE ==========");
	   }

	   public long close_time_hours() {//차량 나간 시간 체크 _시간
	      long hours = ((System.currentTimeMillis() / (1000 * 60 * 60)) % 24) + 9;
	      return hours;
	   }

	   public long close_time_minutes() {//차량 나간 시간 체크 _분
	      long open_minutes = ((System.currentTimeMillis() / (1000 * 60)) % 60);
	      return open_minutes;
	   }
	}