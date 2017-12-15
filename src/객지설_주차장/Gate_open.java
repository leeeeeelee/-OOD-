package 객지설_주차장;

public class Gate_open {// 게이트 오픈
	   public void open() {//출력
	      System.out.println("========== GATE OPEN ==========");
	   }
	   
	   public long open_time_hours() {// 차량 진입 시간 측정_시
	      long open_hours = ((System.currentTimeMillis() / (1000*60*60)) % 24) + 9;
	      return open_hours;
	   }
	   
	   public long open_time_minutes(){ // 차량 진입 시간 측정_분
	      long open_minutes = ((System.currentTimeMillis() / (1000*60)) % 60);
	      return open_minutes;
	   }
	}