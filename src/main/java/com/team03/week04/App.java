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
    	boolean go = true;
    	
    	while(go) {
    		System.out.println("User의 요금제를 입력하세요. ");
    		user.setPlanTypeName(scan.next());

    		if(user.getPlanTypeName().equals("Gold")) {
    			planType = new Gold();
    			go = false;
    		} else if(user.getPlanTypeName().equals("Silver")){
    			planType = new Silver();
    			go = false;
    		}else{
    			System.out.println("잘못된 입력값입니다.");
    		}
    		
    	}
    	
    	go = true;
    	while(go){
    	System.out.println("User의 회선 수를 입력하세요. ");
    	user.setNumberOfLines(scan.nextInt());
    	if(user.getNumberOfLines()<=0)
    		System.out.println("잘못된 입력값입니다.");
    	else
    		go = false;
    	}
    	
    	go = true;
    	while(go){
    	System.out.println("User의 사용시간을 입력하세요. ");
    	user.setMinutesUsed(scan.nextInt());
    	if(user.getMinutesUsed()<=0)
    		System.out.println("잘못된 입력값입니다.");
    	else
    		go = false;
    	}
    	

    	System.out.println("User의 요금제 : " + user.getPlanTypeName());

    	System.out.println("User의 회선 수 : " + user.getNumberOfLines());

    	System.out.println("User의 사용시간 : "+ user.getMinutesUsed());
    	
    	totalRate.calTotalRate(user, planType);    	
    }
}
