package 객지설_주차장;

public class Car_out {//주차장에서 차를 뺄 때

	public Car Car_out(Car c[][],int carnum){//차 번호를 통해 주차장에서 객체를 삭제함
		Car temp=null;
		//주차장의 위치를 탐색하며 해당 차의 위치를 찾아 그 위치를 null로 만들어준다.(객체 삭제)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				if (c[i][j]!=null&&c[i][j].getCarnum() == carnum){
					temp=c[i][j];
					c[i][j]=null;//주차장에서 차 정보 삭제 == 그 객체를 삭제->전체 정보가 삭제됨. 따라서 삭제된 객체를 저장해두어야한다.
					return temp;
				}
			}
		}
		return temp;//삭제된 객체 리턴
	}
}