package com.kh.model.vo;

public class Greentealatte extends BeveragesMenu{
	
	public Greentealatte(int price, boolean withIce, boolean toGo) {
		super(price, withIce, toGo);
	
	}
	
	@Override
	public void iNeed() {
		System.out.println("녹차라떼 한 잔이요.");
	}

	
	@Override
	public void getOrder() {
		String str = "";
		if(super.isWithIce() == true) {
			str = "아이스 ";
		} else {
			str = "따뜻한 ";
		}
		System.out.println(str + "녹차라떼 한 잔이 주문완료 되었습니다.");
		System.out.println("주문하신 음료는 " + super.getPrice() + "원입니다.");
	}
	
	
	
}
