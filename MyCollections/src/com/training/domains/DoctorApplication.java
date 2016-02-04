package com.training.domains;


import java.util.*;

//import java.util.Scanner;

public class DoctorApplication {

	public static void main(String[] args) {
		
		NursingHome nh = new NursingHome();
		Doctor d1 = new Doctor(104,"Ram","Physician");
		Doctor d2 = new Doctor(102,"Sam","Surgeon");
		Doctor d3 = new Doctor(103,"Kevin","Gynae");
		Doctor d4 = new Doctor(101,"David","Dentist");
		
		
		nh.addDoctor(d1);
		nh.addDoctor(d2);
		nh.addDoctor(d3);
		nh.addDoctor(d4);
		
		Patient p1 = new Patient(901,"Gaurav",21,82983232);
		Patient p2 = new Patient(902,"David",22,829832232);
		Patient p3 = new Patient(903,"Beneth",24,822347832);
		
		
		TreeSet<Patient> p = new TreeSet<Patient>();
		
		//HashSet is not ordered in any way-comparable/comparator not required 
		
		//HashSet<Patient> p = new HashSet<Patient>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		
		
		d1.setPatients(p);
		
		nh.printDoctorList();
		
		//nh.printSortedList();
		
		/*System.out.println("Doctor List sorted By ID:-");
		nh.printSortedList(1);
		
		System.out.println("Doctor List sorted By Name:-");
		nh.printSortedList(2);
		
		System.out.println("Doctor List sorted By Specialization:-");
		nh.printSortedList(3);*/
		
		
		
	}

}
