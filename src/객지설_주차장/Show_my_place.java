package 객지설_주차장;
import java.util.Scanner;
public class Show_my_place {
	private boolean yes_no;
	public void show(Parking_space p){
		Scanner tmeppp = new Scanner(System.in);
    	System.out.println("조회 방식을 선택하세요 (이름 - 0,차 번호 - 1,핸드폰번호 - 2) ");
    	int view2;
    	view2=tmeppp.nextInt();
    	if(view2==0){//이름으로 차 위치 조회
    		String name;
    		System.out.println("이름을 입력하세요 :");
    		Scanner input = new Scanner(System.in);
    		name=input.nextLine();
    		yes_no=p.C_place_name(name);
    		while(yes_no==false){//잘못된 이름을 입력했을시
    			System.out.println("입력한 이름의 차량은 존재하지 않습니다. 다시 입력하세요.");
    			System.out.println("이름을 입력하세요 :");
    			name=input.nextLine();
    			yes_no=p.C_place_name(name);
    		}
    	}
    	else if(view2==1){//차 번호로 위치 조회
    		int numb;
    		System.out.println("차량 번호를 입력하세요 :");
    		numb=tmeppp.nextInt();
    		yes_no=p.C_place_carNum(numb);
    		while(yes_no==false){//잘못된 번호를 입력했을시
    			System.out.println("입력한 번호의 차량은 존재하지 않습니다. 다시 입력하세요.");
    			System.out.println("차량 번호를 입력하세요 :");
    			numb=tmeppp.nextInt();
    			yes_no=p.C_place_carNum(numb);
    		}
    	}
    	else if(view2==2){//핸드폰 번호로 조회
    		String num;
    		System.out.println("핸드폰 번호를 입력하세요 :");
    		Scanner input = new Scanner(System.in);
    		num=input.nextLine();
    		yes_no=p.C_place_phoneNum(num);
    		while(yes_no==false){//잘못된 핸드폰 번호를 입력했을시
    			System.out.println("입력한 핸드폰 번호의 차량은 존재하지 않습니다. 다시 입력하세요.");
    			System.out.println("핸드폰 번호를 입력하세요 :");
    			num=input.nextLine();
    			yes_no=p.C_place_phoneNum(num);
    		}
    	}
	}
}