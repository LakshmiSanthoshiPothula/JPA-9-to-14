package com.cg.jpastart.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="con_emp3")
public class ContractEmployee extends Employee {
private int duration;
private boolean extendable;
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public boolean isExtendable() {
	return extendable;
}
@Override
public String toString() {
	return "ContractEmployee [duration=" + duration + ", extendable="
			+ extendable + ", getEmployeeId()=" + getEmployeeId()
			+ ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
}
public void setExtendable(boolean extendable) {
	this.extendable = extendable;
}

}
