package 객지설_주차장;

public class Calculate {//요금 계산
	public void CalculatePay(Car c){
		Time_check time= new Time_check();//총 주차 시간 계산 위해 객체 생성
		time.print_time(c);//주차 시간 정보 출력
		long stay_time[]=time.time_Check(c);//총 주차 시간을 출력한 뒤 그 값을 stay_time에 저장
		int money=500;
		int plus_money=200;
		int sum_money=0;
		
		//test를 위한 코드
		/*if(stay_time[1]<1&&stay_time[0]==0){//주차 시간이 15분 미만일경우
			System.out.println("1분 미만 주차는 무료입니다.\n");			
		}
		else{//계산 해야 할 경우
			if(stay_time[0]>=1){//시간 당 계산
				sum_money=sum_money+((int)stay_time[0]*money*2);
			}
			if(stay_time[1]>=1&&stay_time[1]<10){
				sum_money=sum_money+plus_money;
			}
			if(stay_time[1]>=10&&stay_time[1]<30){
				sum_money=sum_money+(plus_money*2);
			}
			if(stay_time[1]>=30&&stay_time[1]<50){
				sum_money=sum_money+(plus_money*3);
			}
			if(stay_time[1]>=40&&stay_time[1]<60){
				sum_money=sum_money+(plus_money*4);
			}
			System.out.println("\n총 요금 : "+sum_money+"원\n");
		}*/
		
		//실제 사용시 코드
		if(stay_time[1]<10&&stay_time[0]==0){//주차 시간이 15분 미만일경우
			System.out.println("10분 미만 주차는 무료입니다.\n");			
		}
		else{//계산 해야 할 경우
			if(stay_time[0]>=1){
				sum_money=sum_money+((int)stay_time[0]*money*2);
			}
			if(stay_time[1]>=10&&stay_time[1]<20){
				sum_money=sum_money+plus_money;
			}
			if(stay_time[1]>=20&&stay_time[1]<30){
				sum_money=sum_money+(plus_money*2);
			}
			if(stay_time[1]>=30&&stay_time[1]<40){
				sum_money=sum_money+(plus_money*3);
			}
			if(stay_time[1]>=40&&stay_time[1]<50){
				sum_money=sum_money+(plus_money*4);
			}
			if(stay_time[1]>=50&&stay_time[1]<60){
				sum_money=sum_money+(plus_money*5);
			}
			System.out.println("\n총 요금 : "+sum_money+"원\n");
		}
	}
	public void print_pay(){
		//test용 요금표
		/*System.out.println("\n=================");
		System.out.println(" ====test요금표====");
		System.out.println(" ====1분 미만 무료 ===");
		System.out.println(" == 기본 요금 200원 ==");
		System.out.println(" =20분 당 200원 추가==");
		System.out.println(" ===시간 당1000원===");
		System.out.println("=================\n");*/
		
		//실제 사용시 요금표
		System.out.println("\n=================");
		System.out.println(" ======요금표======");
		System.out.println(" ===10분 미만 무료 ===");
		System.out.println(" == 기본 요금 500원 ==");
		System.out.println(" =10분 당 200원 추가==");
		System.out.println(" ===시간 당1000원===");
		System.out.println("=================\n");
	}
}