package com.kh.model.vo;

public class Smoothie extends BeveragesMenu{
	
	public Smoothie(int price, boolean withIce, boolean toGo) {
		super(price, withIce, toGo );
	
	}
	
	@Override
	public void iNeed() {
		System.out.println("스무디 한 잔이요.");
	}

	
	@Override
	public void getOrder() {

		System.out.println("스무디 한 잔이 주문완료 되었습니다.");
		System.out.println("주문하신 음료는 " + super.getPrice() + "원입니다.");
	}
}
