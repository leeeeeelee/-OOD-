package ������_������;
import java.util.Scanner;
public class Parking {//���� ����
      public Car Car_in(Car c[][], String name, String phone_num, int carnum){//i,j��ġ�� ������Ű��
          Scanner input =new Scanner(System.in);
            System.out.print("�����ϰ� ���� ��ǥ �Է� : ");
            int i=input.nextInt();
            int j=input.nextInt();
            while(i>4||j>5){//�߸��� ��ġ�� �Է��� ���
            	System.out.println("�׷� ��ġ�� �������� �ʽ��ϴ�.�ٽ� �Է��ϼ���.");
            	System.out.print("�����ϰ� ���� ��ǥ �Է� : ");
            	i=input.nextInt();
            	j=input.nextInt();
            }//����� �Է��Ҷ����� �ݺ�
            while(c[i][j]!=null){//�̹� ������ ���� ������ ���
               System.out.println("�̹� ������ ���Դϴ�. �ٽ� �Է��ϼ���.");
               System.out.print("�����ϰ� ���� ��ǥ �Է� : ");
                i=input.nextInt();
                j=input.nextInt();
            }
            c[i][j]=new Car(name, phone_num ,carnum);//�� ��ġ�� �־��� ������ �� ��ü�� ����
            return c[i][j];//������ �� ��ü ����
         }
}