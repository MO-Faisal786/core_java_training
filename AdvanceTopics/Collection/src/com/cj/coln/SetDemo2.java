package com.cj.coln;

import java.util.*;

public class SetDemo2 {
	public static void main(String[] args) {
		Students st1 = new Students();
		st1.setId(101);
		st1.setName("Faisal");
		st1.setDept("CSE");
		
		Students st2 = new Students();
		st2.setId(103);
		st2.setName("Malik");
		st2.setDept("IT");
		
		Students st3 = new Students();
		st3.setId(102);
		st3.setName("Khalida");
		st3.setDept("GDA");
		
		Set stTrSet = new TreeSet(new CustomSortStudents());
		stTrSet.add(st1);
		stTrSet.add(st2);
		stTrSet.add(st3);
		
		System.out.println(stTrSet);
		
		Set trSet = new TreeSet(new CustomSorting());
		trSet.add(20);
		trSet.add(10);
		trSet.add(8);
		
		System.out.println(trSet);
		
		Set strTrSet = new TreeSet(new CustomSortString());
		strTrSet.add("Faisal");
		strTrSet.add("Malik");
		strTrSet.add("Khalida");
		strTrSet.add("Zais");
		strTrSet.add("Mayank");
		
		System.out.println(strTrSet);
		
		
		
	}
}
