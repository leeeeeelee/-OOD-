package ������_������;

public class Parking_space {//������ ���� Ŭ������ �̿��Ͽ� �������� �����ϴ� �Լ����� ����� �� �ְ��ϴ� Ŭ���� ->���� ���
	
	Car c[][] = new Car[5][6];//��ü ���� ����. 5*6=30�� �ڸ� ����
	
	public void seat_check(){//������ �ܿ� �¼� Ȯ��
		Seat_check sc=new Seat_check();
		sc.see_seat(c);
	}
	
	public void real_parking(String name, String string, int carnum){//���� ����
	      Parking p=new Parking();
	      Gate_open o=new Gate_open();//gate�� ������
	      Car cp;
	      cp=p.Car_in(c, name, string, carnum);//�����ѵ� cp�� ������ ������ �����س���
	      cp.start_h=o.open_time_hours();//���� ���� �ð� ����
	      cp.start_m=o.open_time_minutes();//���� ���� �� ����
	   }
	
	public Car out(int num){//�� ����->�� ��ȣ�� ���ڷ� ������ ������
		Car_out cout =new Car_out();
		return cout.Car_out(c, num);//�����忡�� ������ ���� ����
	}
	
	public void look_num(){//������ �ܿ� �¼��� �ε����� Ȯ��
		Look_space ls=new Look_space();
		ls.see_space(c);
	}
	
	public boolean C_place_carNum(int num){//�� ��ġ ã��->�� ��ȣ��
		Find_car fc= new Find_car();
		return fc.Car_place_CarNum(c, num);//true or false ���� 
	}
	
	public boolean C_place_phoneNum(String num){//�� ��ġ ã��->���� ��ȣ��
		Find_car fc= new Find_car();
		return fc.Car_place_phoneNum(c, num);
	}
	
	public boolean C_place_name(String name){//�� ��ġ ã��->���� �̸�����
		Find_car fc= new Find_car();
		return fc.Car_place_name(c, name);
	}	
}
