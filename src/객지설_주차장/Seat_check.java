package ������_������;

public class Seat_check {//���� �ڸ��� �¼� ��ġ���� Ȯ��
	
	public void see_seat(Car c[][]) {//���� �ڸ� Ȯ��
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				if (c[i][j] == null)
					System.out.print(" �� ");//�� �ڸ��� ���
				else
					System.out.print(" �� ");//�ڸ��� �� ���
			}
			System.out.println("");
		}
	}
}
