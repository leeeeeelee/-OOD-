package ������_������;
import java.text.SimpleDateFormat;//�ð� ȣ��
import java.util.Scanner;

public class Test {
   public static void main(String[] args) {
      int choice = 0;
      int message_check = 0;
      int car_num = 0;
      String user_name = null;
      String phone = null;
      int carnumber = 0;
      
      //���� ��¥�� ���� �ð� ���
      long today = System.currentTimeMillis();
      System.out.print("TODAY : ");
      SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
      System.out.println(sdf1.format(today).toString());
      System.out.print("TIME : ");
      SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss a");
      System.out.println(sdf2.format(today).toString());
      
      //��ü ����
      Gate_open o = new Gate_open();
      Screen sc = new Screen();
      Parking_space p = new Parking_space();
      Message m = new Message();
      Calculate lll=new Calculate();
      Show_my_place sp=new Show_my_place();
      
      while (true) {
         System.out.println("1. ����  2. ����");
         Scanner input = new Scanner(System.in);
         choice = input.nextInt();
         if (choice == 1) { // ������ ���
            o.open(); // ����Ʈ ����
            System.out.println("���� ���� �ð��� " + o.open_time_hours() + "�� " + o.open_time_minutes() + "�� �Դϴ�.");
            sc.Welcome(); //ȯ�� �λ� ���
            //���� �ϱ� �� ���� ������ �¼� ������
            System.out.println("   < ���� ���� ���� �¼� >");
            p.seat_check(); //�ܿ� �¼� Ȯ�� �Լ� ȣ��
            p.look_num(); //�ܿ� �¼� ��ǥ�� Ȯ�� �Լ� ȣ��
            System.out.print("���� ����� �̸� �Է� : ");
            Scanner input1 = new Scanner(System.in);
            user_name = input1.next();
            System.out.print("���� ������� �ڵ��� ��ȣ �Է� : ");
            Scanner input2 = new Scanner(System.in);
            phone = input2.next();
            System.out.print("���� ��ȣ �Է� :  ");
            Scanner input3 = new Scanner(System.in);
            carnumber = input3.nextInt();
            p.real_parking(user_name, phone, carnumber);
            // �����Ϸ��ϰ� ����Ȯ�� ��ġ Ȯ�� ���
            System.out.println("    < ���� �Ϸ� >");
            p.seat_check();
            p.look_num();
            m.message_print(); //�޼��� ���� �˶�
            System.out.print("�޼����� Ȯ���Ͻðڽ��ϱ�?(�� - 1, �ƴϿ� - 0) ");
            Scanner input4 = new Scanner(System.in);
            message_check = input4.nextInt();
            if (message_check == 1) {//�޼��� Ȯ���� ���
               m.message_show();
            }
         }
         if (choice == 2) {//������ ���
            Car temp;
            System.out.println("���� ��ġ�� ��ȸ�Ͻðڽ��ϱ�? (�� - 1, �ƴϿ� - 0) ");
            int view;
            view=input.nextInt();
            if(view==1){//���� ��ġ ��ȸ
            	sp.show(p);
            }
            Scanner input5 = new Scanner(System.in);
            System.out.println("������ ���� ��ȣ�� �Է��ϼ��� : "); //������ȣ �Է�(int �Է�)
            car_num = input5.nextInt();
            temp = p.out(car_num);//������ �� ��ü�� temp��
            while(temp==null){//����� ������ ���� �ʾ��� ���
            	System.out.println("�Է��� ��ȣ�� ���� �������� �ʽ��ϴ�.\n������ ���� ��ȣ�� �ٽ� �Է��ϼ��� : ");
            	car_num = input5.nextInt();
            	temp = p.out(car_num);
            }
            Gate_close g = new Gate_close();
            p.seat_check();
            p.look_num();
            temp.end_h = g.close_time_hours();//������ �ð� ����
            temp.end_m = g.close_time_minutes();//������ �� ����
            
            //���� ��� ��� ��  ���ǥ ���
            lll.print_pay();//���ǥ ���
            lll.CalculatePay(temp);//���� ��� ���
            sc.bye();//�ۺ� �λ� ���
         }
      }
   }
}