package com.team03.week04;

import java.util.Scanner;

public class App {
	private App(){
	}
    public static void main( String[] args ) {
    	Scanner scan = new Scanner(System.in);
    	User user = new User();
    	PlanType planType = null;
    	TotalRate totalRate = new TotalRate();
    	
    	System.out.println("User의 요금제를 입력하세요. ");
    	user.setPlanTypeName(scan.next());
    	System.out.println("User의 회선 수를 입력하세요. ");
    	user.setNumberOfLines(scan.nextInt());
    	System.out.println("User의 사용시간을 입력하세요. ");
    	user.setMinutesUsed(scan.nextInt());
    	
    	if(user.getPlanTypeName().equals("Gold")) {
    		planType = new Gold();
    	} else {
    		planType = new Silver();
    	}

    	System.out.println("User의 요금제 : " + user.getPlanTypeName());

    	System.out.println("User의 회선 수 : " + user.getNumberOfLines());

    	System.out.println("User의 사용시간 : "+ user.getMinutesUsed());
    	
    	System.out.println(totalRate.calTotalRate(user, planType));    	
    }
}
