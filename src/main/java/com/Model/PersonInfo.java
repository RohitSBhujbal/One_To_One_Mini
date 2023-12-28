package com.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PersonInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int person_id;
	private String person_First_Name;
	private String person_Last_Name;
	private int person_Age;
	private double pesrson_Salary;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pass_Info")
	private PassportInfo pass_Info;

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public String getPerson_First_Name() {
		return person_First_Name;
	}

	public void setPerson_First_Name(String person_First_Name) {
		this.person_First_Name = person_First_Name;
	}

	public String getPerson_Last_Name() {
		return person_Last_Name;
	}

	public void setPerson_Last_Name(String person_Last_Name) {
		this.person_Last_Name = person_Last_Name;
	}

	public int getPerson_Age() {
		return person_Age;
	}

	public void setPerson_Age(int person_Age) {
		this.person_Age = person_Age;
	}

	public double getPesrson_Salary() {
		return pesrson_Salary;
	}

	public void setPesrson_Salary(double pesrson_Salary) {
		this.pesrson_Salary = pesrson_Salary;
	}

	public PassportInfo getPass_Info() {
		return pass_Info;
	}

	public void setPass_Info(PassportInfo pass_Info) {
		this.pass_Info = pass_Info;
	}

	@Override
	public String toString() {
		return "PersonInfo [person_id=" + person_id + ", person_First_Name=" + person_First_Name + ", person_Last_Name="
				+ person_Last_Name + ", person_Age=" + person_Age + ", pesrson_Salary=" + pesrson_Salary
				+ ", pass_Info=" + pass_Info + "]";
	}
	
	

}
