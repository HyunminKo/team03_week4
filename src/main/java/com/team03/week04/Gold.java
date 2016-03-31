package com.team03.week04;

public class Gold extends PlanType{
	Gold(){
		this.setBasicMonthlyRate(49.95);
		this.setAdditionalLineRate(14.50);
		this.setFamilyDistcount(5.0);
		this.setIncludedMinutes(1000);
		this.setRatePerExcessMinute(0.45);
	}
}
