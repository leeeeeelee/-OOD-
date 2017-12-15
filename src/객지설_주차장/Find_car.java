package 객지설_주차장;

public class Find_car {//차량 위치 조회 클래스
	
	public boolean Car_place_CarNum(Car c[][],int num){//차량 위치 조회->차량 번호로 조회
		//주차장에서 차량 번호를 통해 해당 차량의 위치를 찾아냄
		for(int i=0;i<5;i++){
			for(int j=0;j<6;j++){
				if(c[i][j]!=null){
					if(c[i][j].getCarnum()==num){
						System.out.println("\n차 번호:"+num+", 위치 :"+i+","+j+" ");
						return true;
					}
				}
			}
		}
		return false;//해당 차량을 찾지 못했을 경우 false리턴
	}
	
	public boolean Car_place_name(Car c[][],String name){//차량 위치 조회->차 주 이름으로 조회
		//주차장에서 사용자 이름을 통해 해당 차량의 위치를 찾아냄
		for(int i=0;i<5;i++){
			for(int j=0;j<6;j++){
				if(c[i][j]!=null){
					if(c[i][j].getName().equals(name)){
						System.out.println("\n차주 이름:"+name+", 위치 :"+i+","+j+" ");
						return true;
					}
						
				}
			}
		}
		return false;//해당 차량을 찾지 못했을 경우 false리턴
	}
	
	public boolean Car_place_phoneNum(Car c[][],String phoneNum){//차량 위치 조회->차 주 번호로 조회
		//주차장에서 사용자 핸드폰 번호을 통해 해당 차량의 위치를 찾아냄
		for(int i=0;i<5;i++){
			for(int j=0;j<6;j++){
				if(c[i][j]!=null){
					if(c[i][j].getPhonenum().equals(phoneNum)){
						System.out.println("\n차주 번호:"+phoneNum+", 위치 :"+i+","+j+" ");
						return true;
					}
				}
			}
		}
		return false;//해당 차량을 찾지 못했을 경우 false리턴
	}
}