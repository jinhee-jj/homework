package com.kh.model.vo;

public class Client {
	private String nickname;
	private int money = 20000;

	AllDrinks a = new AllDrinks();
	
	public Client(String nickname) {
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	

	
	public void payMoney() {
		if (money < a.getPrice()) {
			System.out.println("가지고 계신 돈이 부족합니다.");
		}
	
	}
	
	@Override
	public String toString() {
		return "현재  " + (money - a.getPrice()) + "원 남았습니다.";
				
	}
	
	
}



