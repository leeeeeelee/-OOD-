package ������_������;

public class Look_space {//���� �ڸ� Ȯ��_�ε���
	//�������� ��ġ�� �ε����� ����ϴ� �޼ҵ�
	 public void see_space(Car c[][]){
         int place=0;
         for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
               if(c[i][j]==null){//�ڸ��� ����������
                  System.out.print(i+","+j+" ");//�ε��� ���
                  place++;//�ܿ� �¼� ������Ű��
               }
               else System.out.print("    ");
            }
            System.out.println("");
         }
         System.out.println("");
         System.out.println("===== �ܿ� �¼� :"+place + "======");//�ܿ� �¼� ���
         System.out.println();
      }
}