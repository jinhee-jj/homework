package com.kh.model.vo;

public class Clerk {
	private int money = 0;
	
	public Clerk() {}
	
	AllDrinks a = new AllDrinks();
	
	
	
	
	public void serveCustomer() {
		System.out.println("�������, �ֹ� ���͵帮�ڽ��ϴ�.");
	}
	
	
	public void getMoney() {
		AllDrinks a = new AllDrinks();
		money += a.getPrice();
	}
	
	public void makingDrinks() {
		System.out.println("�ֹ��Ͻ� ���Ḧ ���� ���Դϴ�..");		
	}
	
	public void serveDrinks(){
		System.out.println("�ֹ��Ͻ� ���ᰡ ���Խ��ϴ�. ���ְ� �弼��.");
	}
	
}