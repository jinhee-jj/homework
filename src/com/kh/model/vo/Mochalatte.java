package com.kh.model.vo;

public class Mochalatte extends EspressoMenu{

	public Mochalatte(int price, boolean withIce, boolean toGo, int shotNum) {
		super(price, withIce, toGo, shotNum);
	}
	
	@Override
	public void iNeed() {
		System.out.println("��ī�� �� ���̿�.");
	}

	
	@Override
	public void getOrder() {
		String str = "";
		if(super.isWithIce() == true) {
			str = "���̽� ";
		} else {
			str = "������ ";
		}
		System.out.println(str + "��ī�� �� ���� �ֹ��Ϸ� �Ǿ����ϴ�.");
		System.out.println("�ֹ��Ͻ� ����� " + super.getPrice() + "��, ���� " + super.getShotNum() + "�� �Դϴ�.");
	}
}
