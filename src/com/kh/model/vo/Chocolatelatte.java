package com.kh.model.vo;

public class Chocolatelatte extends BeveragesMenu{
	
	public Chocolatelatte(int price, boolean withIce, boolean toGo) {
		super(price, withIce, toGo );
	
	}
	
	@Override
	public void iNeed() {
		System.out.println("���ڶ� �� ���̿�.");
	}

	
	@Override
	public void getOrder() {
		String str = "";
		if(super.isWithIce() == true) {
			str = "���̽� ";
		} else {
			str = "������ ";
		}
		System.out.println(str + "���ڶ� �� ���� �ֹ��Ϸ� �Ǿ����ϴ�.");
		System.out.println("�ֹ��Ͻ� ����� " + super.getPrice() + "���Դϴ�.");
	}
}
