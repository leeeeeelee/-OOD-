package ������_������;

public class Calculate {//��� ���
	public void CalculatePay(Car c){
		Time_check time= new Time_check();//�� ���� �ð� ��� ���� ��ü ����
		time.print_time(c);//���� �ð� ���� ���
		long stay_time[]=time.time_Check(c);//�� ���� �ð��� ����� �� �� ���� stay_time�� ����
		int money=500;
		int plus_money=200;
		int sum_money=0;
		
		//test�� ���� �ڵ�
		/*if(stay_time[1]<1&&stay_time[0]==0){//���� �ð��� 15�� �̸��ϰ��
			System.out.println("1�� �̸� ������ �����Դϴ�.\n");			
		}
		else{//��� �ؾ� �� ���
			if(stay_time[0]>=1){//�ð� �� ���
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
			System.out.println("\n�� ��� : "+sum_money+"��\n");
		}*/
		
		//���� ���� �ڵ�
		if(stay_time[1]<10&&stay_time[0]==0){//���� �ð��� 15�� �̸��ϰ��
			System.out.println("10�� �̸� ������ �����Դϴ�.\n");			
		}
		else{//��� �ؾ� �� ���
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
			System.out.println("\n�� ��� : "+sum_money+"��\n");
		}
	}
	public void print_pay(){
		//test�� ���ǥ
		/*System.out.println("\n=================");
		System.out.println(" ====test���ǥ====");
		System.out.println(" ====1�� �̸� ���� ===");
		System.out.println(" == �⺻ ��� 200�� ==");
		System.out.println(" =20�� �� 200�� �߰�==");
		System.out.println(" ===�ð� ��1000��===");
		System.out.println("=================\n");*/
		
		//���� ���� ���ǥ
		System.out.println("\n=================");
		System.out.println(" ======���ǥ======");
		System.out.println(" ===10�� �̸� ���� ===");
		System.out.println(" == �⺻ ��� 500�� ==");
		System.out.println(" =10�� �� 200�� �߰�==");
		System.out.println(" ===�ð� ��1000��===");
		System.out.println("=================\n");
	}
}