package 객지설_주차장;
public class Time_check {//주차 전체 시간 출력
	public long[] time_Check(Car c){//총 주차 시간 계산
		long stay[]=new long[2];//stay[0]->시간, stay[1]->분
		calculate_time(c);
		long stay_min=c.end_m-c.start_m;
		long stay_hour=c.end_h-c.start_h;
		stay[0]=stay_hour;
		stay[1]=stay_min;
		System.out.println("총 주차 시간 :"+stay_hour+"시 "+stay_min+"분");
		return stay;//배열 리턴(시간, 분 리턴)
	}
	private void calculate_time(Car c){//시간 계산시 사용
		if(c.start_m > c.end_m){//시작한 분> 끝나는 분
			c.end_h -=1;
			c.end_m +=60;
		}
	}
	public void print_time(Car c){//주차 시작 시간과 종료 시간을 출력
		System.out.println("주차 시작 :"+c.start_h+"시 "+c.start_m+"분");
		System.out.println("주차 종료 :"+c.end_h+"시 "+c.end_m+"분");
	}
}