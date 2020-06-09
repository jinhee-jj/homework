package com.kh.model.vo;

public class EspressoMenu extends AllDrinks{
	private int shotNum;
	
	
	public EspressoMenu() {}
	
	public EspressoMenu(int price, boolean withIce, boolean toGo, int shotNum) {
	super(price, withIce, toGo);
	this.shotNum = shotNum;
	
	}

	public int getShotNum() {
		return shotNum;
	}

	public void setShotNum(int shotNum) {
		this.shotNum = shotNum;
	}
	
	@Override
	public void getOrder() {
		
	}
}
