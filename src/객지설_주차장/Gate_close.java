package ������_������;

public class Gate_close { //����Ʈ Ŭ����
	   public void close() {//���
	      System.out.println("========== GATE CLOSE ==========");
	   }

	   public long close_time_hours() {//���� ���� �ð� üũ _�ð�
	      long hours = ((System.currentTimeMillis() / (1000 * 60 * 60)) % 24) + 9;
	      return hours;
	   }

	   public long close_time_minutes() {//���� ���� �ð� üũ _��
	      long open_minutes = ((System.currentTimeMillis() / (1000 * 60)) % 60);
	      return open_minutes;
	   }
	}