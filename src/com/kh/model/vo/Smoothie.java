package com.kh.model.vo;

public class Smoothie extends BeveragesMenu{
	
	public Smoothie(int price, boolean withIce, boolean toGo) {
		super(price, withIce, toGo );
	
	}
	
	@Override
	public void iNeed() {
		System.out.println("������ �� ���̿�.");
	}

	
	@Override
	public void getOrder() {

		System.out.println("������ �� ���� �ֹ��Ϸ� �Ǿ����ϴ�.");
		System.out.println("�ֹ��Ͻ� ����� " + super.getPrice() + "���Դϴ�.");
	}
}
