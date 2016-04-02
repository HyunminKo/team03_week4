package com.team03.week04;

public class Silver extends PlanType{
	public Silver(){
		this.setBasicMonthlyRate(29.95);
		this.setAdditionalLineRate(21.50);
		this.setFamilyDistcount(5.0);
		this.setIncludedMinutes(500);
		this.setRatePerExcessMinute(0.54);
	}
}