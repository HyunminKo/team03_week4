package com.team03.week04;

public class Gold extends PlanType{
	final double goldBasicMonthlyRate = 49.95;
	final double goldAdditionalLineRate = 14.50;
	final double goldFamilyDistcount = 5.0;
	final int goldInculdedMinutes = 1000;
	final double goldRatePerExcessMinute = 0.45;
	
	public Gold(){
		this.setBasicMonthlyRate(goldBasicMonthlyRate);
		this.setAdditionalLineRate(goldAdditionalLineRate);
		this.setFamilyDistcount(goldFamilyDistcount);
		this.setIncludedMinutes(goldInculdedMinutes);
		this.setRatePerExcessMinute(goldRatePerExcessMinute);
	}
}
