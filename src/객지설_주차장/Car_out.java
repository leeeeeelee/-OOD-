package ������_������;

public class Car_out {//�����忡�� ���� �� ��

	public Car Car_out(Car c[][],int carnum){//�� ��ȣ�� ���� �����忡�� ��ü�� ������
		Car temp=null;
		//�������� ��ġ�� Ž���ϸ� �ش� ���� ��ġ�� ã�� �� ��ġ�� null�� ������ش�.(��ü ����)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				if (c[i][j]!=null&&c[i][j].getCarnum() == carnum){
					temp=c[i][j];
					c[i][j]=null;//�����忡�� �� ���� ���� == �� ��ü�� ����->��ü ������ ������. ���� ������ ��ü�� �����صξ���Ѵ�.
					return temp;
				}
			}
		}
		return temp;//������ ��ü ����
	}
}