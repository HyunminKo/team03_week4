package com.team03.week04;

public class PlanType {
	private double additionalLineRate;
	private double ratePerExcessMinute;
	private int includedMinutes;
	private double basicMonthlyRate;
	
	public double getAdditionalLineRate() {
		return additionalLineRate;
	}
	public double getRatePerExcessMinute() {
		return ratePerExcessMinute;
	}
	public int getIncludedMinutes() {
		return includedMinutes;
	}
	public double getBasicMonthlyRate() {
		return basicMonthlyRate;
	}
	public double getFamilyDistcount() {
		return familyDistcount;
	}
	private double familyDistcount;
}


