package 객지설_주차장;

public class Seat_check {//남는 자리를 좌석 배치도로 확인
	
	public void see_seat(Car c[][]) {//남은 자리 확인
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				if (c[i][j] == null)
					System.out.print(" □ ");//빈 자리일 경우
				else
					System.out.print(" ■ ");//자리가 찬 경우
			}
			System.out.println("");
		}
	}
}
