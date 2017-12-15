package 객지설_주차장;
import java.text.SimpleDateFormat;//시간 호출
import java.util.Scanner;

public class Test {
   public static void main(String[] args) {
      int choice = 0;
      int message_check = 0;
      int car_num = 0;
      String user_name = null;
      String phone = null;
      int carnumber = 0;
      
      //오늘 날짜와 현재 시각 출력
      long today = System.currentTimeMillis();
      System.out.print("TODAY : ");
      SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
      System.out.println(sdf1.format(today).toString());
      System.out.print("TIME : ");
      SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss a");
      System.out.println(sdf2.format(today).toString());
      
      //객체 생성
      Gate_open o = new Gate_open();
      Screen sc = new Screen();
      Parking_space p = new Parking_space();
      Message m = new Message();
      Calculate lll=new Calculate();
      Show_my_place sp=new Show_my_place();
      
      while (true) {
         System.out.println("1. 주차  2. 출차");
         Scanner input = new Scanner(System.in);
         choice = input.nextInt();
         if (choice == 1) { // 주차할 경우
            o.open(); // 게이트 오픈
            System.out.println("차량 진입 시간은 " + o.open_time_hours() + "시 " + o.open_time_minutes() + "분 입니다.");
            sc.Welcome(); //환영 인사 출력
            //주차 하기 전 주차 가능한 좌석 보여줌
            System.out.println("   < 현재 주차 가능 좌석 >");
            p.seat_check(); //잔여 좌석 확인 함수 호출
            p.look_num(); //잔여 좌석 좌표로 확인 함수 호출
            System.out.print("차량 사용자 이름 입력 : ");
            Scanner input1 = new Scanner(System.in);
            user_name = input1.next();
            System.out.print("차량 사용자의 핸드폰 번호 입력 : ");
            Scanner input2 = new Scanner(System.in);
            phone = input2.next();
            System.out.print("차량 번호 입력 :  ");
            Scanner input3 = new Scanner(System.in);
            carnumber = input3.nextInt();
            p.real_parking(user_name, phone, carnumber);
            // 주차완료하고 주차확인 위치 확인 출력
            System.out.println("    < 주차 완료 >");
            p.seat_check();
            p.look_num();
            m.message_print(); //메세지 전송 알람
            System.out.print("메세지를 확인하시겠습니까?(예 - 1, 아니요 - 0) ");
            Scanner input4 = new Scanner(System.in);
            message_check = input4.nextInt();
            if (message_check == 1) {//메세지 확인할 경우
               m.message_show();
            }
         }
         if (choice == 2) {//출차할 경우
            Car temp;
            System.out.println("차량 위치를 조회하시겠습니까? (예 - 1, 아니요 - 0) ");
            int view;
            view=input.nextInt();
            if(view==1){//차량 위치 조회
            	sp.show(p);
            }
            Scanner input5 = new Scanner(System.in);
            System.out.println("출차할 차량 번호를 입력하세요 : "); //차량번호 입력(int 입력)
            car_num = input5.nextInt();
            temp = p.out(car_num);//삭제된 차 객체는 temp차
            while(temp==null){//제대로 출차가 되지 않았을 경우
            	System.out.println("입력한 번호의 차는 존재하지 않습니다.\n출차할 차량 번호를 다시 입력하세요 : ");
            	car_num = input5.nextInt();
            	temp = p.out(car_num);
            }
            Gate_close g = new Gate_close();
            p.seat_check();
            p.look_num();
            temp.end_h = g.close_time_hours();//끝나는 시간 저장
            temp.end_m = g.close_time_minutes();//끝나는 분 저장
            
            //주차 요금 계산 및  요금표 출력
            lll.print_pay();//요금표 출력
            lll.CalculatePay(temp);//계산된 요금 출력
            sc.bye();//작별 인사 출력
         }
      }
   }
}