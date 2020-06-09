package com.kh.controller;

import com.kh.model.vo.AllDrinks;
import com.kh.model.vo.Americano;
import com.kh.model.vo.BeveragesMenu;
import com.kh.model.vo.Clerk;
import com.kh.model.vo.Client;
import com.kh.model.vo.EspressoMenu;
import com.kh.model.vo.Greentealatte;
import com.kh.model.vo.Mochalatte;



public class AllDrinksManager {

	public void getYourDrink(String nickname) {
		
		Client ct = new Client(nickname);
		Clerk ck = new Clerk();
		EspressoMenu m1 = new Mochalatte(5000, true, true, 2); 
		
		
		ck.serveCustomer();
		
		
		if(m1 instanceof Mochalatte) {
			((Mochalatte)m1).iNeed();
			((Mochalatte)m1).getOrder();
		}
		

		ct.payMoney();
		
		ck.makingDrinks();
		ck.serveDrinks();
		
		
		ct.setMoney(ct.getMoney() - m1.getPrice());;
		System.out.println(ct);
		
		System.out.println();
		
		AllDrinks a1 = new Americano(3800, false, true, 1);
		
		ck.serveCustomer();
		
		if(a1 instanceof Americano) {
			((Americano)a1).iNeed();
			((Americano)a1).getOrder();
		}
		
		ct.payMoney();
		
		ck.makingDrinks();
		ck.serveDrinks();
		
		
		ct.setMoney(ct.getMoney() - a1.getPrice());;
		System.out.println(ct);
		
		
		System.out.println();
		BeveragesMenu g1 = new Greentealatte(4800, true, false);
		
		ck.serveCustomer();
		
		if(g1 instanceof Greentealatte) {
			((Greentealatte)g1).iNeed();
			((Greentealatte)g1).getOrder();
		}
		
		ct.payMoney();
		
		ck.makingDrinks();
		ck.serveDrinks();
		
		
		ct.setMoney(ct.getMoney() - g1.getPrice());;
		System.out.println(ct);
		
	}

}
