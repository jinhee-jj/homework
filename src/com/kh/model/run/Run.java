package com.kh.model.run;

import java.util.Scanner;

import com.kh.controller.AllDrinksManager;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AllDrinksManager adm = new AllDrinksManager();

		System.out.print("�г����� �������� �Ͻðڽ��ϱ�? : ");
		String nickname = sc.next();
	
		adm.getYourDrink(nickname);
	
	}

}
