package com.training.domains;

import java.util.*;

import com.training.utils.MyComparators;

public class NursingHome {

		
		
		private ArrayList<Doctor> docList;
		
		public NursingHome(){
			super();
			docList = new ArrayList<Doctor> ();
		}
		
		public boolean addDoctor(Doctor doc){
			
			boolean result = docList.add(doc);
			return result;
			
		}
		
		public void printDoctorList(){
			for(Doctor doc  : docList){
				
				if(doc.getPatients()!=null)
				{
					System.out.println(doc);
				
					System.out.println("Appointments");
					for(Patient pat : doc.getPatients()){
					System.out.println(pat);
				}
			}}
		}
		
		public void printSortedList(){
			Collections.sort(docList);; // must implement Comparable Interface
			
			//Reusing Print Function
			printDoctorList();

	}
		
		public void printSortedList(int key){
			switch(key){
			case 1 : 
				printSortedList();
				break;
			case 2:
				MyComparators comp = new MyComparators();
				MyComparators.NameComparator comp1 = comp.new NameComparator();
				Collections.sort(docList,comp1);
				printDoctorList();
				break;
			case 3 :
				MyComparators comp2 = new MyComparators();
				MyComparators.SpecializationComparator comp3 = comp2.new SpecializationComparator();
				Collections.sort(docList,comp3);
				printDoctorList();
				break;
			case 4:
				
					break;
			}
			
		}
		}


