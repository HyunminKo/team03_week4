package com.team03.week04;

import java.util.Scanner;

public class App {
	private App(){
	}
    public static void main( String[] args ) {
    	Scanner scan = new Scanner(System.in);
    	User user = new User();
    	user.setPlanTypeName(scan.next());
    	user.setNumberOfLines(scan.nextInt());
    	user.setMinutesUsed(scan.nextInt());

    	System.out.println("User의 요금제 : " + user.getPlanTypeName());

    	System.out.println("User의 회선 수 : " + user.getNumberOfLines());

    	System.out.println("User의 사용시간 : "+ user.getMinutesUsed());
    }
}
