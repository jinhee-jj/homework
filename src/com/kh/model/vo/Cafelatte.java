package com.kh.model.vo;

public class Cafelatte extends EspressoMenu{

	
	
	
	public Cafelatte(int price, boolean withIce, boolean toGo, int shotNum) {
		super(price, withIce, toGo, shotNum);
	}
	
	
	
	
	@Override
	public void getOrder() {
		String str = "";
		if(super.isWithIce() == true) {
			str = "아이스";
		} else {
			str = "따뜻한";
		}
		System.out.println(str + "카페라떼 한 잔이 주문완료 되었습니다.");
		System.out.println("주문하신 음료는 " + super.getPrice() + "원, 샷은" + super.getShotNum() + "샷 입니다.");
		
	}
		
	
	}
