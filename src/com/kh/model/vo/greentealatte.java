package com.kh.model.vo;

public class Greentealatte extends BeveragesMenu{
	
	public Greentealatte(int price, boolean withIce, boolean toGo) {
		super(price, withIce, toGo);
	
	}
	
	@Override
	public void iNeed() {
		System.out.println("������ �� ���̿�.");
	}

	
	@Override
	public void getOrder() {
		String str = "";
		if(super.isWithIce() == true) {
			str = "���̽� ";
		} else {
			str = "������ ";
		}
		System.out.println(str + "������ �� ���� �ֹ��Ϸ� �Ǿ����ϴ�.");
		System.out.println("�ֹ��Ͻ� ����� " + super.getPrice() + "���Դϴ�.");
	}
	
	
	
}
