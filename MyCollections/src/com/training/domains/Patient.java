package com.training.domains;

import java.util.*;

public class Patient implements Comparable<Patient> {
	
	private long patientId;
	private String patientName;
	private int patientAge;
	private int contactNum;
	
	
	public Patient() {
		super();
		
	}


	public Patient(long patientId, String patientName, int patientAge, int contactNum) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.contactNum = contactNum;
	}


	public long getPatientId() {
		return patientId;
	}


	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public int getPatientAge() {
		return patientAge;
	}


	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}


	public int getContactNum() {
		return contactNum;
	}


	public void setContactNum(int contactNum) {
		this.contactNum = contactNum;
	}


	


	

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
				+ ", contactNum=" + contactNum + "]";
	}


	@Override
	public int compareTo(Patient o) {
		if(patientId<o.patientId) return -1;
		if(patientId>o.patientId) return 1;
		return 0;
	}
	
	
	
	
	
	

}
