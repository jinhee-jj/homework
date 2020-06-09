package com.kh.model.vo;

public class AllDrinks {
	private int price;
	private boolean withIce;
	private boolean toGo;

	public AllDrinks() {}
	
	public AllDrinks(int price, boolean withIce, boolean toGo) {
		this.price = price;
		this.withIce = withIce;
		this.toGo = toGo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isWithIce() {
		return withIce;
	}

	public void setWithIce(boolean withIce) {
		this.withIce = withIce;
	}

	public boolean isToGo() {
		return toGo;
	}

	public void setToGo(boolean toGo) {
		this.toGo = toGo;
	}
	
	
	public void iNeed() {
		
	}
	
	
	
	public void getOrder() {
		String str = "";
		if(withIce == true) {
			str = "아이스";
		} else {
			str = "따뜻한";
		}
	}
	

}
