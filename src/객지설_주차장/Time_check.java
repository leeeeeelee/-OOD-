package ������_������;
public class Time_check {//���� ��ü �ð� ���
	public long[] time_Check(Car c){//�� ���� �ð� ���
		long stay[]=new long[2];//stay[0]->�ð�, stay[1]->��
		calculate_time(c);
		long stay_min=c.end_m-c.start_m;
		long stay_hour=c.end_h-c.start_h;
		stay[0]=stay_hour;
		stay[1]=stay_min;
		System.out.println("�� ���� �ð� :"+stay_hour+"�� "+stay_min+"��");
		return stay;//�迭 ����(�ð�, �� ����)
	}
	private void calculate_time(Car c){//�ð� ���� ���
		if(c.start_m > c.end_m){//������ ��> ������ ��
			c.end_h -=1;
			c.end_m +=60;
		}
	}
	public void print_time(Car c){//���� ���� �ð��� ���� �ð��� ���
		System.out.println("���� ���� :"+c.start_h+"�� "+c.start_m+"��");
		System.out.println("���� ���� :"+c.end_h+"�� "+c.end_m+"��");
	}
}