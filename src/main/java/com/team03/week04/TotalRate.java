package com.team03.week04;

public class TotalRate {
	private double totalRate = 0;
	private double lineCost = 0;
	private double usedCost = 0;
	
	public int calNumberOfLine(User user, PlanType planType) {
		// 
		return 0;
	}
	
	public double calMinuteUsed(User user, PlanType planType) {
		//
		return 0;
	}
	
	public double calTotalRate() {
		totalRate = lineCost + usedCost;
		return totalRate;
	}
	
	public double getTotalRate() {
		return this.totalRate;
	}
}
