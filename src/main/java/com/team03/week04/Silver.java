package com.team03.week04;

public class Silver extends PlanType{
	static final double silverBasicMonthlyRate = 29.95;
	static final double silverAdditionalLineRate = 21.50;
	static final double silverFamilyDistcount = 5.0;
	static final int silverIncludeMinutes = 500;
	static final double silverRatePerExcessMinute = 0.54;
	
	public Silver(){
		this.setBasicMonthlyRate(silverBasicMonthlyRate);
		this.setAdditionalLineRate(silverAdditionalLineRate);
		this.setFamilyDistcount(silverFamilyDistcount);
		this.setIncludedMinutes(silverIncludeMinutes);
		this.setRatePerExcessMinute(silverRatePerExcessMinute);
	}
}