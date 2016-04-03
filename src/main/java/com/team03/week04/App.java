package com.team03.week04;

import java.util.Scanner;

public class App {
	private static final String PRINTERRORMESSAGE = "잘못된 입력값입니다.";
	private App(){
	}
    public static void main( String[] args ) {
    	Scanner scan = new Scanner(System.in);
    	User user = new User();
    	PlanType planType = null;
    	TotalRate totalRate = new TotalRate();
    	boolean go = true;
    	
    	
    	
    	while(go) {
    		System.out.println("User의 요금제(Gold 또는 Silver)를 입력하세요.");
    		user.setPlanTypeName(scan.next());

    		if("Gold".equals(user.getPlanTypeName()) || "gold".equals(user.getPlanTypeName())) {
    			planType = new Gold();
    			go = false;
    		} else if("Silver".equals(user.getPlanTypeName()) || "silver".equals(user.getPlanTypeName())){
    			planType = new Silver();
    			go = false;
    		}else{
    			System.out.println(PRINTERRORMESSAGE);
    		}
    		
    	}
    	
    	go = true;
    	while(go){
	    	System.out.println("User의 회선 수를 입력하세요. ");
	    	user.setNumberOfLines(scan.nextInt());
	    	if(user.getNumberOfLines()<=0){
	    		System.out.println(PRINTERRORMESSAGE);
	    	}
	    	else{
	    		go = false;
	    	}
    	}
    	
    	go = true;
    	while(go){
	    	System.out.println("User의 사용시간을 입력하세요. ");
	    	user.setMinutesUsed(scan.nextInt());
	    	if(user.getMinutesUsed()<=0){
	    		System.out.println(PRINTERRORMESSAGE);
	    	}
	    	else{
	    		go = false;
	    	}
    	}
    	

    	System.out.println("User의 요금제 : " + user.getPlanTypeName());

    	System.out.println("User의 회선 수 : " + user.getNumberOfLines());

    	System.out.println("User의 사용시간 : "+ user.getMinutesUsed());
    	
    	totalRate.calTotalRate(user, planType);    	
    }
}
