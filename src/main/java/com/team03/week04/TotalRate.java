<<<<<<< HEAD
package com.team03.week04;

public class TotalRate {
	private double totalRate = 0;
	private double lineCost = 0;
	private double usedCost = 0;
	String resultofLines="",resultofUsed="";
	// 기본요금+회선에 대한 추가요금(요금제에 따라서 기본요금과 추가되는 요금이 다르다)
	public double calNumberOfLine(User user, PlanType planType) {
		int numberOfLines = user.getNumberOfLines();
		lineCost = planType.getBasicMonthlyRate();
		if (numberOfLines > 1 && numberOfLines <= 3) {
			lineCost += ((numberOfLines - 1) * planType.getAdditionalLineRate());
			resultofLines+=(planType.getBasicMonthlyRate()+" + ( "+numberOfLines+" * "+planType.getAdditionalLineRate()+" )");
		} else if (numberOfLines >= 4) {
			lineCost += (((numberOfLines - 3) * planType.getFamilyDistcount())+planType.getAdditionalLineRate()*2);
			resultofLines+=(planType.getBasicMonthlyRate()+" + ( "+2+" * "+planType.getAdditionalLineRate()+" ) + "+
			" ( "+(numberOfLines-3)+" * "+planType.getFamilyDistcount()+" )");
		}
		return lineCost;
	}

	// 초과 금액에 대한 추가요금 계산
	public double calMinuteUsed(User user, PlanType planType) {
		
		int minutesUsed = user.getMinutesUsed();
		double ratePerExcessMinute = planType.getRatePerExcessMinute();
		int includedMinutes = planType.getIncludedMinutes();
		
		if (minutesUsed > includedMinutes) {
			usedCost = (minutesUsed - includedMinutes) * ratePerExcessMinute;
			resultofUsed+=(" + ( "+(minutesUsed - includedMinutes)+" * "+ratePerExcessMinute+" ) = ");
		} else {
			resultofUsed+=" = ";
			usedCost = 0;
		}
		return usedCost;
	}

	public double calTotalRate(User user, PlanType planType) {
		totalRate = calNumberOfLine(user, planType) + calMinuteUsed(user, planType);
		totalRate = Double.parseDouble(String.format("%.2f", totalRate));
		App.LOG.info(resultofLines+resultofUsed+totalRate+"$");
		return totalRate;
	}

	public double getTotalRate() {
		
		return this.totalRate;
	}
}
=======
package com.team03.week04;

public class TotalRate {
	private static final String PREROUNDBRACKET = " + ( ";
	private static final String POSTROUNDBRACKET = " )";
	private double totalCost = 0;
	private double lineCost = 0;
	private double usedCost = 0;

	// 기본요금+회선에 대한 추가요금(요금제에 따라서 기본요금과 추가되는 요금이 다르다)
	public double calNumberOfLine(User user, PlanType planType) {

		int numberOfLines = user.getNumberOfLines();
		lineCost = planType.getBasicMonthlyRate();
		if (numberOfLines > 1 && numberOfLines <= 3) {
			lineCost += ((numberOfLines - 1) * planType.getAdditionalLineRate());
			System.out.print(planType.getBasicMonthlyRate()+PREROUNDBRACKET+(numberOfLines-1)+" * "+planType.getAdditionalLineRate()+POSTROUNDBRACKET);
		} else if (numberOfLines >= 4) {
			lineCost += (((numberOfLines - 3) * planType.getFamilyDistcount())+planType.getAdditionalLineRate()*2);
			System.out.print(planType.getBasicMonthlyRate()+PREROUNDBRACKET+2+" * "+planType.getAdditionalLineRate()+POSTROUNDBRACKET+
					PREROUNDBRACKET+(numberOfLines-3)+" * "+planType.getFamilyDistcount()+POSTROUNDBRACKET);
		} else if(numberOfLines == 1) {
			System.out.print(planType.getBasicMonthlyRate());
		}
		
		return lineCost;
	}

	// 초과 금액에 대한 추가요금 계산
	public double calMinuteUsed(User user, PlanType planType) {
		
		int minutesUsed = user.getMinutesUsed();
		double ratePerExcessMinute = planType.getRatePerExcessMinute();
		int includedMinutes = planType.getIncludedMinutes();
		
		if (minutesUsed > includedMinutes) {
			usedCost = (minutesUsed - includedMinutes) * ratePerExcessMinute;
			System.out.print(PREROUNDBRACKET+(minutesUsed - includedMinutes)+" * "+ratePerExcessMinute+POSTROUNDBRACKET);
		} else {
			usedCost = 0;
		}
			
		return usedCost;
	}

	public double calTotalRate(User user, PlanType planType) {
		totalCost = calNumberOfLine(user, planType) + calMinuteUsed(user, planType);
		System.out.printf(" = %.2f",totalCost);
		return totalCost;
	}

	public double getTotalRate() {
		return this.totalCost;
	}
}
>>>>>>> 255f826121dfeb2be7a42829caca6857c31a3724
