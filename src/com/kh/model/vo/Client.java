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
			System.out.println("������ ��� ���� �����մϴ�.");
		}
	
	}
	
	@Override
	public String toString() {
		return "����  " + (money - a.getPrice()) + "�� ���ҽ��ϴ�.";
				
	}
	
	
}



