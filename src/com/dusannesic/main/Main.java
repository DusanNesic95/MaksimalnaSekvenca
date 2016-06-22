package com.dusannesic.main;

import java.util.Scanner;

import com.dusannesic.stringutils.StringUtils;

public class Main {

	public static void main(String[] args) {
		String prvi = "";
		String drugi = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Unesite dve reci:");
		prvi = scan.nextLine();
		drugi = scan.nextLine();
		
		String rezultat = StringUtils.najduzaSekvenca(prvi, drugi);
		
		System.out.println("Resenje je: " + rezultat);
		
		scan.close();
	}
	
}
