package 객지설_주차장;
public class Car{//자동차 객체
	
private String name;//자동차 주인 이름
private String phone_num;//주인 번호
private int carnum;//자동차 번호

public long start_h,start_m, end_h,end_m;//시작 시간-분, 종료 시간-분

public Car(){//기본생성자
	this.carnum=0;
	this.phone_num=null;
	this.name=null;
}

public Car(String name, String phone_num, int carnum){//생성자
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
