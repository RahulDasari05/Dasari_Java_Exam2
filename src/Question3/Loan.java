/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Dasari Rahul
 */
public class Loan {
    private double amount;
	private double interest;
	private double repaymentPeriod;
	
	public Loan(double amount, double interest, double repaymentPeriod) {
		super();
		this.amount = amount;
		this.interest = interest;
		this.repaymentPeriod = repaymentPeriod;
	}
	public double getAmount() {
		return amount;
	}
	public double getInterest() {
		return interest;
	}
	public double getrepaymentPeriod() {
		return repaymentPeriod;
	}
	@Override
	public String toString() {
		return "Loan class :- amount= " + amount + ", interest= " +
                        interest + ", RepaymentPeriod= " + repaymentPeriod;
	}
}

