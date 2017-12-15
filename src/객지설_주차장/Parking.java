package 객지설_주차장;
import java.util.Scanner;
public class Parking {//실제 주차
      public Car Car_in(Car c[][], String name, String phone_num, int carnum){//i,j위치에 주차시키기
          Scanner input =new Scanner(System.in);
            System.out.print("주차하고 싶은 좌표 입력 : ");
            int i=input.nextInt();
            int j=input.nextInt();
            while(i>4||j>5){//잘못된 위치를 입력한 경우
            	System.out.println("그런 위치는 존재하지 않습니다.다시 입력하세요.");
            	System.out.print("주차하고 싶은 좌표 입력 : ");
            	i=input.nextInt();
            	j=input.nextInt();
            }//제대로 입력할때까지 반복
            while(c[i][j]!=null){//이미 주차된 곳을 선택한 경우
               System.out.println("이미 주차된 곳입니다. 다시 입력하세요.");
               System.out.print("주차하고 싶은 좌표 입력 : ");
                i=input.nextInt();
                j=input.nextInt();
            }
            c[i][j]=new Car(name, phone_num ,carnum);//그 위치에 주어진 정보로 차 객체를 생성
            return c[i][j];//주차된 차 객체 리턴
         }
}