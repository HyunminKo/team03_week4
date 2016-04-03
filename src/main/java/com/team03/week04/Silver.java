package com.team03.week04;

public class Silver extends PlanType{
	final double silverBasicMonthlyRate = 29.95;
	final double silverAdditionalLineRate = 21.50;
	final double silverFamilyDistcount = 5.0;
	final int silverIncludeMinutes = 500;
	final double silverRatePerExcessMinute = 0.54;
	
	public Silver(){
		this.setBasicMonthlyRate(silverBasicMonthlyRate);
		this.setAdditionalLineRate(silverAdditionalLineRate);
		this.setFamilyDistcount(silverFamilyDistcount);
		this.setIncludedMinutes(silverIncludeMinutes);
		this.setRatePerExcessMinute(silverRatePerExcessMinute);
	}
}