package 객지설_주차장;

public class Look_space {//남는 자리 확인_인덱스
	//주차장의 위치를 인덱스로 출력하는 메소드
	 public void see_space(Car c[][]){
         int place=0;
         for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
               if(c[i][j]==null){//자리가 비어있을경우
                  System.out.print(i+","+j+" ");//인덱스 출력
                  place++;//잔여 좌석 증가시키기
               }
               else System.out.print("    ");
            }
            System.out.println("");
         }
         System.out.println("");
         System.out.println("===== 잔여 좌석 :"+place + "======");//잔여 좌석 출력
         System.out.println();
      }
}