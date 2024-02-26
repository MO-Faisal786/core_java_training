package com.cj.coln;

import java.util.Comparator;

public class CustomSortStudents implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Students st1 = (Students) o1;
		Students st2 = (Students) o2;
		return -(st1.getId()-st2.getId());
	}
	
}
