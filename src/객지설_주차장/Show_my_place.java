package ������_������;
import java.util.Scanner;
public class Show_my_place {
	private boolean yes_no;
	public void show(Parking_space p){
		Scanner tmeppp = new Scanner(System.in);
    	System.out.println("��ȸ ����� �����ϼ��� (�̸� - 0,�� ��ȣ - 1,�ڵ�����ȣ - 2) ");
    	int view2;
    	view2=tmeppp.nextInt();
    	if(view2==0){//�̸����� �� ��ġ ��ȸ
    		String name;
    		System.out.println("�̸��� �Է��ϼ��� :");
    		Scanner input = new Scanner(System.in);
    		name=input.nextLine();
    		yes_no=p.C_place_name(name);
    		while(yes_no==false){//�߸��� �̸��� �Է�������
    			System.out.println("�Է��� �̸��� ������ �������� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
    			System.out.println("�̸��� �Է��ϼ��� :");
    			name=input.nextLine();
    			yes_no=p.C_place_name(name);
    		}
    	}
    	else if(view2==1){//�� ��ȣ�� ��ġ ��ȸ
    		int numb;
    		System.out.println("���� ��ȣ�� �Է��ϼ��� :");
    		numb=tmeppp.nextInt();
    		yes_no=p.C_place_carNum(numb);
    		while(yes_no==false){//�߸��� ��ȣ�� �Է�������
    			System.out.println("�Է��� ��ȣ�� ������ �������� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
    			System.out.println("���� ��ȣ�� �Է��ϼ��� :");
    			numb=tmeppp.nextInt();
    			yes_no=p.C_place_carNum(numb);
    		}
    	}
    	else if(view2==2){//�ڵ��� ��ȣ�� ��ȸ
    		String num;
    		System.out.println("�ڵ��� ��ȣ�� �Է��ϼ��� :");
    		Scanner input = new Scanner(System.in);
    		num=input.nextLine();
    		yes_no=p.C_place_phoneNum(num);
    		while(yes_no==false){//�߸��� �ڵ��� ��ȣ�� �Է�������
    			System.out.println("�Է��� �ڵ��� ��ȣ�� ������ �������� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
    			System.out.println("�ڵ��� ��ȣ�� �Է��ϼ��� :");
    			num=input.nextLine();
    			yes_no=p.C_place_phoneNum(num);
    		}
    	}
	}
}