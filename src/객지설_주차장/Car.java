package ������_������;
public class Car{//�ڵ��� ��ü
	
private String name;//�ڵ��� ���� �̸�
private String phone_num;//���� ��ȣ
private int carnum;//�ڵ��� ��ȣ

public long start_h,start_m, end_h,end_m;//���� �ð�-��, ���� �ð�-��

public Car(){//�⺻������
	this.carnum=0;
	this.phone_num=null;
	this.name=null;
}

public Car(String name, String phone_num, int carnum){//������
	this.name=name;
	this.phone_num=phone_num;
	this.carnum=carnum;
}

public int getCarnum(){//getter
	return carnum;
}

public String getPhonenum(){//getter
	return phone_num;
}

public String getName(){//getter
	return name;
}
}
