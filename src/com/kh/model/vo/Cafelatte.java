package com.kh.model.vo;

public class Cafelatte extends EspressoMenu{

	
	
	
	public Cafelatte(int price, boolean withIce, boolean toGo, int shotNum) {
		super(price, withIce, toGo, shotNum);
	}
	
	
	
	
	@Override
	public void getOrder() {
		String str = "";
		if(super.isWithIce() == true) {
			str = "���̽�";
		} else {
			str = "������";
		}
		System.out.println(str + "ī��� �� ���� �ֹ��Ϸ� �Ǿ����ϴ�.");
		System.out.println("�ֹ��Ͻ� ����� " + super.getPrice() + "��, ����" + super.getShotNum() + "�� �Դϴ�.");
		
	}
		
	
	}
