package com.cj.coln;

import java.util.Comparator;

public class CustomSorting implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer num1 = (Integer) o1;
		Integer num2 = (Integer) o2;
		return -(num1-num2);
	}

}
