package com.soft6creators.futurespace.app.investment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.soft6creators.futurespace.app.account.Account;
import com.soft6creators.futurespace.app.crypto.Crypto;

@Entity
public class Investment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int investmentId;
	@ManyToOne
	private Account account;
	private String investedAmount;
	private String days;
	private boolean isActive;
	private String investmentPlan;
	private String startDate;
	private String endDate;
	private String percentage;
	@ManyToOne
	private Crypto currency;
	public String getInvestmentId() {
		return investmentId;
	}
	public void setInvestmentId(int investmentId) {
		this.investmentId = investmentId;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getInvestedAmount() {
		return investedAmount;
	}
	public void setInvestedAmount(String investedAmount) {
		this.investedAmount = investedAmount;
	}
	
	
	public Crypto getCurrency() {
		return currency;
	}
	public void setCurrency(Crypto currency) {
		this.currency = currency;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public String getInvestmentPlan() {
		return investmentPlan;
	}
	public void setInvestmentPlan(String investmentPlan) {
		this.investmentPlan = investmentPlan;
	}
	
	
	
	
}
