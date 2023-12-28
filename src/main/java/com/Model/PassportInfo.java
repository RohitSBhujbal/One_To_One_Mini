package com.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class PassportInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="paasIdGen")
	@SequenceGenerator(name="paasIdGen",initialValue = 50000,allocationSize = 1000)
	
	private int Pass_Id;
	private long pass_Number;
	private String country;
	public int getPass_Id() {
		return Pass_Id;
	}
	public void setPass_Id(int pass_Id) {
		Pass_Id = pass_Id;
	}
	public long getPass_Number() {
		return pass_Number;
	}
	public void setPass_Number(long pass_Number) {
		this.pass_Number = pass_Number;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "PassportInfo [Pass_Id=" + Pass_Id + ", pass_Number=" + pass_Number + ", country=" + country + "]";
	}
	
	
}
