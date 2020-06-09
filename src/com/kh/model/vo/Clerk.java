package com.kh.model.vo;

public class Clerk {
	private int money = 0;
	
	public Clerk() {}
	
	AllDrinks a = new AllDrinks();
	
	
	
	
	public void serveCustomer() {
		System.out.println("어서오세요, 주문 도와드리겠습니다.");
	}
	
	
	public void getMoney() {
		AllDrinks a = new AllDrinks();
		money += a.getPrice();
	}
	
	public void makingDrinks() {
		System.out.println("주문하신 음료를 제조 중입니다..");		
	}
	
	public void serveDrinks(){
		System.out.println("주문하신 음료가 나왔습니다. 맛있게 드세요.");
	}
	
}