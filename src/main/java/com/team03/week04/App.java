package com.team03.week04;

import java.util.Scanner;
import java.util.logging.Logger;


public class App {
<<<<<<< HEAD
	public static Logger LOG = Logger.getLogger("InfoLogging");

=======
	private static final String PRINTERRORMESSAGE = "잘못된 입력값입니다.";
>>>>>>> 255f826121dfeb2be7a42829caca6857c31a3724
	private App(){
	}
    public static void main( String[] args ) {
    	
    	Scanner scan = new Scanner(System.in);
    	User user = new User();
    	PlanType planType = null;
    	TotalRate totalRate = new TotalRate();
    	boolean go = true;
    	
    	
    	
    	while(go) {
<<<<<<< HEAD
    		LOG.info("User의 요금제를 입력하세요.");
=======
    		System.out.println("User의 요금제(Gold 또는 Silver)를 입력하세요.");
>>>>>>> 255f826121dfeb2be7a42829caca6857c31a3724
    		user.setPlanTypeName(scan.next());

    		if("Gold".equals(user.getPlanTypeName()) || "gold".equals(user.getPlanTypeName())) {
    			planType = new Gold();
    			go = false;
    		} else if("Silver".equals(user.getPlanTypeName()) || "silver".equals(user.getPlanTypeName())){
    			planType = new Silver();
    			go = false;
    		}else{
<<<<<<< HEAD
    			LOG.info("잘못된 입력값입니다.");
=======
    			System.out.println(PRINTERRORMESSAGE);
>>>>>>> 255f826121dfeb2be7a42829caca6857c31a3724
    		}
    		
    	}
    	
    	go = true;
    	while(go){
<<<<<<< HEAD
    	LOG.info("User의 회선 수를 입력하세요.");
    	user.setNumberOfLines(scan.nextInt());
    	if(user.getNumberOfLines()<=0)
    		LOG.info("잘못된 입력값입니다.");
    	else
    		go = false;
=======
	    	System.out.println("User의 회선 수를 입력하세요. ");
	    	user.setNumberOfLines(scan.nextInt());
	    	if(user.getNumberOfLines()<=0){
	    		System.out.println(PRINTERRORMESSAGE);
	    	}else{
	    		go = false;
	    	}
>>>>>>> 255f826121dfeb2be7a42829caca6857c31a3724
    	}
    	
    	go = true;
    	while(go){
<<<<<<< HEAD
    	LOG.info("User의 사용시간을 입력하세요.");
    	user.setMinutesUsed(scan.nextInt());
    	if(user.getMinutesUsed()<=0)
    		LOG.info("잘못된 입력값입니다.");
    	else
    		go = false;
=======
	    	System.out.println("User의 사용시간을 입력하세요. ");
	    	user.setMinutesUsed(scan.nextInt());
	    	if(user.getMinutesUsed()<=0){
	    		System.out.println(PRINTERRORMESSAGE);
	    	}else{
	    		go = false;
	    	}
>>>>>>> 255f826121dfeb2be7a42829caca6857c31a3724
    	}
    	

    	LOG.info("User의 요금제 : " + user.getPlanTypeName());

    	LOG.info("User의 회선 수 : " + user.getNumberOfLines());

    	LOG.info("User의 사용시간 : "+ user.getMinutesUsed());
    	
    	totalRate.calTotalRate(user, planType);    	
    }
}
