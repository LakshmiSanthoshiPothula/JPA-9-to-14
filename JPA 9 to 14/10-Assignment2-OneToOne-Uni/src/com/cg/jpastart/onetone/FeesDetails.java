package com.cg.jpastart.onetone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
  @Entity
public class FeesDetails {
	@Id
	@Column(name="f_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int f_id;
	@Column(name="TOTAL_FEES")
	private double totalFees;
	@Column(name="NO_OF_INSTALLMENTS")
	private int noOfInstallments;

	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public double getTotalFees() {
		return totalFees;
	}
	public void setTotalFees(double totalFees) {
		this.totalFees = totalFees;
	}
	public int getNoOfInstallments() {
		return noOfInstallments;
	}
	public void setNoOfInstallments(int noOfInstallments) {
		this.noOfInstallments = noOfInstallments;
	}
	@Override
	public String toString() {
		return "FeeDetails [f_id=" + f_id + ", totalFees=" + totalFees
				+ ", noOfInstallments=" + noOfInstallments + "]";
	}
	public FeesDetails(int f_id, double totalFees, int noOfInstallments) {
		super();
		this.f_id = f_id;
		this.totalFees = totalFees;
		this.noOfInstallments = noOfInstallments;
	}
	public FeesDetails() {
		super();
	}

}
