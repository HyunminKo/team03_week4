package com.team03.week04;

import java.util.Scanner;
import java.util.logging.Logger;


public class App {
	public static Logger LOG = Logger.getLogger("InfoLogging");

	private App(){
	}
    public static void main( String[] args ) {
    	
    	Scanner scan = new Scanner(System.in);
    	User user = new User();
    	PlanType planType = null;
    	TotalRate totalRate = new TotalRate();
    	boolean go = true;
    	
    	while(go) {
    		LOG.info("User의 요금제를 입력하세요.");
    		user.setPlanTypeName(scan.next());

    		if(user.getPlanTypeName().equals("Gold")) {
    			planType = new Gold();
    			go = false;
    		} else if(user.getPlanTypeName().equals("Silver")){
    			planType = new Silver();
    			go = false;
    		}else{
    			LOG.info("잘못된 입력값입니다.");
    		}
    		
    	}
    	
    	go = true;
    	while(go){
    	LOG.info("User의 회선 수를 입력하세요.");
    	user.setNumberOfLines(scan.nextInt());
    	if(user.getNumberOfLines()<=0)
    		LOG.info("잘못된 입력값입니다.");
    	else
    		go = false;
    	}
    	
    	go = true;
    	while(go){
    	LOG.info("User의 사용시간을 입력하세요.");
    	user.setMinutesUsed(scan.nextInt());
    	if(user.getMinutesUsed()<=0)
    		LOG.info("잘못된 입력값입니다.");
    	else
    		go = false;
    	}
    	

    	LOG.info("User의 요금제 : " + user.getPlanTypeName());

    	LOG.info("User의 회선 수 : " + user.getNumberOfLines());

    	LOG.info("User의 사용시간 : "+ user.getMinutesUsed());
    	
    	totalRate.calTotalRate(user, planType);    	
    }
}
