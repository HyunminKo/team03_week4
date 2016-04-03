package com.team03.week04;

public class Gold extends PlanType{
	static final double goldBasicMonthlyRate = 49.95;
	static final double goldAdditionalLineRate = 14.50;
	static final double goldFamilyDistcount = 5.0;
	static final int goldInculdedMinutes = 1000;
	static final double goldRatePerExcessMinute = 0.45;
	
	public Gold(){
		this.setBasicMonthlyRate(goldBasicMonthlyRate);
		this.setAdditionalLineRate(goldAdditionalLineRate);
		this.setFamilyDistcount(goldFamilyDistcount);
		this.setIncludedMinutes(goldInculdedMinutes);
		this.setRatePerExcessMinute(goldRatePerExcessMinute);
	}
}
