package ������_������;

public class Gate_open {// ����Ʈ ����
	   public void open() {//���
	      System.out.println("========== GATE OPEN ==========");
	   }
	   
	   public long open_time_hours() {// ���� ���� �ð� ����_��
	      long open_hours = ((System.currentTimeMillis() / (1000*60*60)) % 24) + 9;
	      return open_hours;
	   }
	   
	   public long open_time_minutes(){ // ���� ���� �ð� ����_��
	      long open_minutes = ((System.currentTimeMillis() / (1000*60)) % 60);
	      return open_minutes;
	   }
	}