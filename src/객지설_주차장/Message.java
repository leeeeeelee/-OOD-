package ������_������;

public class Message { //���� ����
	   public void message_print(){ // �޼��� ���� �˶�
	      System.out.println("�޼����� ���۵Ǿ����ϴ�.");
	   }
	   public void message_show(){ // �޼��� ���� ���
	      Gate_open o = new Gate_open();
	      long hour = o.open_time_hours();
	      long minute = o.open_time_minutes();
	      System.out.println("�ȳ��ϼ���. ����! ���� �������� �̿��� �ּż� �����մϴ�.\n���� ���Խð��� " + hour + "��" + minute + "�� �Դϴ�.");
	      System.out.println("�⺻����� 1�ð��� 1000���̸�, �ʰ��� 10�� �� 200���Դϴ�.\n�����մϴ�.");
	      System.out.println();
	   }
	}