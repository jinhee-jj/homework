package com.kh.model.vo;

public class Americano extends EspressoMenu{
	
	public Americano(int price, boolean withIce, boolean toGo, int shotNum) {
		super(price, withIce, toGo, shotNum);
	}
	
	@Override
	public void iNeed() {
		System.out.println("�Ƹ޸�ī�� �� ���̿�.");
	}
	
	
	@Override
	public void getOrder() {
		String str = "";
		if(super.isWithIce() == true) {
			str = "���̽� ";
		} else {
			str = "������ ";
		}
		System.out.println(str + "�Ƹ޸�ī�� �� ���� �ֹ��Ϸ� �Ǿ����ϴ�.");
		System.out.println("�ֹ��Ͻ� ����� " + super.getPrice() + "��, ���� " + super.getShotNum() + "�� �Դϴ�.");
	}
}
