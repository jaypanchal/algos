package com.designpatterns.creational;


public class FactoryMethodDriver extends GetPlanFactory{
	
	public static void main(String[] args) {
		
		GetPlanFactory getPlanFactory = new GetPlanFactory();
		Plan plan = getPlanFactory.getPlan(DOMESTIC_PLAN);
		plan.getRate();
		plan.calculateBill(2);
	}
}

abstract class Plan {

	protected double rate;
	
	abstract void getRate();
	
	public void calculateBill(int units) {
		System.out.println("Calculated bill :" + (this.rate * units));
	}
}

class DomesticPlan extends Plan {

	@Override
	void getRate() {
		this.rate = 3.50;
	}
}

class CommercialPlan extends Plan{

	@Override
	void getRate() {
		this.rate = 7.50;
	}
}

class InstitutionalPlan extends Plan{

	@Override
	void getRate() {
		this.rate = 5.50;
	}
}

class GetPlanFactory{
	
	protected static final String DOMESTIC_PLAN = "domesticPlan";
	protected static final String COMMERCIAL_PLAN = "commercialPlan";
	protected static final String INSTITUTIONAL_PLAN = "institutionalPlan";
	
	protected Plan getPlan(String planType) {
		if(planType.equals("") || planType.equals(null)) {
			return null;
		}else if(planType.equals(DOMESTIC_PLAN)) {
			return new DomesticPlan();
		}else if(planType.equals(COMMERCIAL_PLAN)) {
			return new CommercialPlan();
		}else if(planType.equals(INSTITUTIONAL_PLAN)) {
			return new InstitutionalPlan();
		}else {
			return null;
		}
	}
}