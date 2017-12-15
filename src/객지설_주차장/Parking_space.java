package 객지설_주차장;

public class Parking_space {//생성해 놓은 클래스를 이용하여 주차장을 관리하는 함수들을 사용할 수 있게하는 클래스 ->제어 기능
	
	Car c[][] = new Car[5][6];//전체 주차 공간. 5*6=30의 자리 존재
	
	public void seat_check(){//주차장 잔여 좌석 확인
		Seat_check sc=new Seat_check();
		sc.see_seat(c);
	}
	
	public void real_parking(String name, String string, int carnum){//실제 주차
	      Parking p=new Parking();
	      Gate_open o=new Gate_open();//gate를 열어줌
	      Car cp;
	      cp=p.Car_in(c, name, string, carnum);//주차한뒤 cp에 주차한 차량을 저장해놓음
	      cp.start_h=o.open_time_hours();//주차 시작 시간 저장
	      cp.start_m=o.open_time_minutes();//주차 시작 분 저장
	   }
	
	public Car out(int num){//차 빼기->차 번호를 인자로 받으면 출차함
		Car_out cout =new Car_out();
		return cout.Car_out(c, num);//주차장에서 삭제된 차량 리턴
	}
	
	public void look_num(){//주차장 잔여 좌석을 인덱스로 확인
		Look_space ls=new Look_space();
		ls.see_space(c);
	}
	
	public boolean C_place_carNum(int num){//차 위치 찾기->차 번호로
		Find_car fc= new Find_car();
		return fc.Car_place_CarNum(c, num);//true or false 리턴 
	}
	
	public boolean C_place_phoneNum(String num){//차 위치 찾기->차주 번호로
		Find_car fc= new Find_car();
		return fc.Car_place_phoneNum(c, num);
	}
	
	public boolean C_place_name(String name){//차 위치 찾기->차주 이름으로
		Find_car fc= new Find_car();
		return fc.Car_place_name(c, name);
	}	
}
