package ������_������;

public class Find_car {//���� ��ġ ��ȸ Ŭ����
	
	public boolean Car_place_CarNum(Car c[][],int num){//���� ��ġ ��ȸ->���� ��ȣ�� ��ȸ
		//�����忡�� ���� ��ȣ�� ���� �ش� ������ ��ġ�� ã�Ƴ�
		for(int i=0;i<5;i++){
			for(int j=0;j<6;j++){
				if(c[i][j]!=null){
					if(c[i][j].getCarnum()==num){
						System.out.println("\n�� ��ȣ:"+num+", ��ġ :"+i+","+j+" ");
						return true;
					}
				}
			}
		}
		return false;//�ش� ������ ã�� ������ ��� false����
	}
	
	public boolean Car_place_name(Car c[][],String name){//���� ��ġ ��ȸ->�� �� �̸����� ��ȸ
		//�����忡�� ����� �̸��� ���� �ش� ������ ��ġ�� ã�Ƴ�
		for(int i=0;i<5;i++){
			for(int j=0;j<6;j++){
				if(c[i][j]!=null){
					if(c[i][j].getName().equals(name)){
						System.out.println("\n���� �̸�:"+name+", ��ġ :"+i+","+j+" ");
						return true;
					}
						
				}
			}
		}
		return false;//�ش� ������ ã�� ������ ��� false����
	}
	
	public boolean Car_place_phoneNum(Car c[][],String phoneNum){//���� ��ġ ��ȸ->�� �� ��ȣ�� ��ȸ
		//�����忡�� ����� �ڵ��� ��ȣ�� ���� �ش� ������ ��ġ�� ã�Ƴ�
		for(int i=0;i<5;i++){
			for(int j=0;j<6;j++){
				if(c[i][j]!=null){
					if(c[i][j].getPhonenum().equals(phoneNum)){
						System.out.println("\n���� ��ȣ:"+phoneNum+", ��ġ :"+i+","+j+" ");
						return true;
					}
				}
			}
		}
		return false;//�ش� ������ ã�� ������ ��� false����
	}
}